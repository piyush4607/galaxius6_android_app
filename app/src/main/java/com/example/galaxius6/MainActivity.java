package com.example.galaxius6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button adminlogin = findViewById(R.id.btnadminlogin);
        Button employeelogin = findViewById(R.id.btnemployeelogin);


        adminlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNextAdmin;
                iNextAdmin = new Intent(MainActivity.this, AdminLogin.class);
                startActivity(iNextAdmin);
            }
        });

        employeelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNextEmployee;
                iNextEmployee = new Intent(MainActivity.this, EmployeeLogin.class);
                startActivity(iNextEmployee);
            }
        });
    }
}