package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_name, tv_id, tv_pass;
    private Button btn_camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_name = findViewById(R.id.tv_name);
        tv_id = findViewById(R.id.tv_id);
        tv_pass = findViewById(R.id.tv_pass);
        btn_camera = findViewById(R.id.btn_camera);

        TextView tv_name = findViewById(R.id.tv_name);
        TextView tv_id = findViewById(R.id.tv_id);
        TextView tv_pass = findViewById(R.id.tv_pass);
        Button btn_camera = findViewById(R.id.btn_camera);
        Button btn_gps = findViewById(R.id.btn_gps);

        // 카메라 버튼
        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(intent);
            }
        });

        // gps 버튼
        btn_gps.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View view) {
                    Intent intent2 = new Intent(MainActivity.this, MapsActivity.class);
                    startActivity(intent2);
                }
        });
        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        String userID = intent.getStringExtra("userID");
        String userPass = intent.getStringExtra("userPass");

        tv_name.setText(String.format("%s님 안녕하세요!", userName));
        tv_id.setText(userID);
        tv_pass.setText(userPass);

    }
}