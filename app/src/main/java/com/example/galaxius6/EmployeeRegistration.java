package com.example.galaxius6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class EmployeeRegistration extends AppCompatActivity {

    EditText etfn, etln, etID, etcn, etfan, etmn, etDOB, etan;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_registration);

        etfn = findViewById(R.id.RegEmployeefn);
        etln = findViewById(R.id.RegEmployeeln);
        etID = findViewById(R.id.RegEmployeeID);
        etcn = findViewById(R.id.RegEmployeeNumber);
        etfan = findViewById(R.id.RegEmployeeFather);
        etmn = findViewById(R.id.RegEmployeeMother);
        etDOB = findViewById(R.id.RegEmployeeDOB);
        etan = findViewById(R.id.RegEmployeeAadhar);
        btn = findViewById(R.id.RegEmployeeBtn);

        AwesomeValidation awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        awesomeValidation.addValidation(this,R.id.RegEmployeefn, "[a-zA-Z\\s]+",R.string.invalid_name);
        awesomeValidation.addValidation(this,R.id.RegEmployeeln, "[a-zA-Z\\s]+",R.string.invalid_name);
        awesomeValidation.addValidation(this, R.id.RegEmployeeID, "^[2-9]{2}[0-9]{4}$", R.string.invalid_ID);
        awesomeValidation.addValidation(this, R.id.RegEmployeeNumber, "^[2-9]{2}[0-9]{8}$", R.string.invalid_number);
        awesomeValidation.addValidation(this,R.id.RegEmployeeFather, "[a-zA-Z\\s]+",R.string.invalid_name);
        awesomeValidation.addValidation(this,R.id.RegEmployeeMother, "[a-zA-Z\\s]+",R.string.invalid_name);
        awesomeValidation.addValidation(this, R.id.RegEmployeeDOB, "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$", R.string.invalid_DOB);
        awesomeValidation.addValidation(this, R.id.RegEmployeeAadhar, "^[2-9]{2}[0-9]{10}$", R.string.invalid_Aadhar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(awesomeValidation.validate()){
                    Toast.makeText( getApplicationContext(), "Registration Successful", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText( getApplicationContext(), "Invalid details", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}