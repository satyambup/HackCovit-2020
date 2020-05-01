package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    public EditText name,email,mobile,address,pincode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email);
        mobile = (EditText)findViewById(R.id.mobile);
        address = (EditText)findViewById(R.id.address);
        pincode = (EditText)findViewById(R.id.pincode);
    }

    public void submitRegistration(View view) {
        if(name.toString() != null && email.toString() != null && mobile.toString() != null && address.toString() != null && pincode.toString() != null) {
            Intent i3 = new Intent(getApplicationContext(), userpage.class);
            startActivity(i3);
        }
        else{
            Toast.makeText(getApplicationContext(),"Enter all the credentials!!",Toast.LENGTH_LONG).show();
        }
    }
}
