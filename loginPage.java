package com.example.loginpage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class loginPage extends AppCompatActivity {

    public EditText user;
    public EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        user = (EditText)findViewById(R.id.userName);
        pass = (EditText)findViewById(R.id.userPassword);
    }

    public void login(View view) {
        Log.i("Info","username is "+user.getText().toString());
        Log.i("Info","Password is "+pass.getText().toString());

        if(user.getText().toString().equals("admin") &&
                pass.getText().toString().equals("password")) {
            Toast.makeText(getApplicationContext(), "Redirecting...",Toast.LENGTH_SHORT).show();
            Intent i4 = new Intent(getApplicationContext(), viewmap.class);
            startActivity(i4);
        }else{
            Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

        }

    }


    public void registration(View view) {
        Intent i2 = new Intent(getApplicationContext(), Registration.class);
        startActivity(i2);
    }
}
