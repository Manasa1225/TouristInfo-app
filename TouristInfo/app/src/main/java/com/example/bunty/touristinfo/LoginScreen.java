package com.example.bunty.touristinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {
    private EditText et_username, et_password;
    private Button bt_login;
    private String default_name = "user123@example.com";
    private String default_password = "User@1234";
    private String name, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
        bt_login = (Button) findViewById(R.id.bt_login);

        et_username.setText("user123@example.com");
      et_password.setText("User@1234");

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

    }

    private void login() {
        name = et_username.getText().toString();
        password = et_password.getText().toString();

        if(name.equals(default_name) && password.equals(default_password)){
            Intent intent = new Intent(LoginScreen.this, ShowCities.class);
            startActivity(intent);
        }else if(TextUtils.isEmpty(name) && TextUtils.isEmpty(password)){
            Toast.makeText(this, "Please enter valid Username/Password", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this,"Invalid Username/password",Toast.LENGTH_SHORT).show();
        }

    }
}