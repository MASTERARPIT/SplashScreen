package com.example.rulewithlaw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView username = findViewById(R.id.username);
        TextView password=findViewById(R.id.password);

        Button loginbtn = findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin")&&password.getText().toString().equals("admin")){
                    Intent login=new Intent(Login.this,MainActivity.class);
                    startActivity(login);
                    finish();
                }else{
                    Toast.makeText(Login.this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}