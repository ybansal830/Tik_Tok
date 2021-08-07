package com.myfirst.tiktok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText email,password;
    private Button login;
    private String emailValid = "[a-zA-Z0-9_-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(SharedPreference.getStringFromSharedPreference(this,"email") != null){
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        }
        initViews();
    }

    private void initViews() {
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().matches(emailValid) && password.getText().toString().trim().length() > 6) {
                    SharedPreference.writeStringIntoSharedPreference(MainActivity.this, email.getText().toString());
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
                else
                    Toast.makeText(MainActivity.this,"Wrong credentials",Toast.LENGTH_SHORT).show();
            }
        });
    }
}