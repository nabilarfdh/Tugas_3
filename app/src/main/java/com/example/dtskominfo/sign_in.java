package com.example.dtskominfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class sign_in extends AppCompatActivity {
    private TextView tvwelcomeback;
    private TextView tvsigin;
    private TextView tvusername;
    private EditText etemail;
    private TextView tvpassword;
    private EditText edpass;
    private TextView tvforgotpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        tvwelcomeback = findViewById(R.id.welcomeback);
        tvsigin = findViewById(R.id.signin);
        tvusername = findViewById(R.id.username);
        etemail = findViewById(R.id.email);
        tvpassword = findViewById(R.id.password);
        tvforgotpass = findViewById(R.id.forgotpass);
    }
}