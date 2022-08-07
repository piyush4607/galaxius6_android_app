package com.example.galaxius6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EmployeeLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_login);

        Button btnEmployeeToast = findViewById(R.id.btnemployeelogin2);
        btnEmployeeToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EmployeeLogin.this, "Employee Login Succeed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}