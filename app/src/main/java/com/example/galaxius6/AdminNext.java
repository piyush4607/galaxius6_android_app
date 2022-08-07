package com.example.galaxius6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminNext extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_next);

        Button newemployeereg = findViewById(R.id.regnewemp);

        newemployeereg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iRegPage;
                iRegPage = new Intent(AdminNext.this, EmployeeRegistration.class);
                startActivity(iRegPage);
            }
        });
    }
}