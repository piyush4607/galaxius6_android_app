package com.example.galaxius6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AdminLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        Button adminloginbtn = findViewById(R.id.btnadminlogin2);
        Button CameraTest = findViewById(R.id.cameratest);

        adminloginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNextRegPage;
                iNextRegPage = new Intent(AdminLogin.this, AdminNext.class);
                Toast.makeText(AdminLogin.this, "Admin Login Succeed", Toast.LENGTH_SHORT).show();
                startActivity(iNextRegPage);
            }
        });

        CameraTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iCamera;
                iCamera = new Intent(AdminLogin.this, CameraCapture.class);
                startActivity(iCamera);
            }
        });

    }
}