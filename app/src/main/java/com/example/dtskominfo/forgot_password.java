package com.example.dtskominfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class forgot_password extends AppCompatActivity {
    private TextView tvforgotpass;
    private TextView tvsubforgotpass;
    private TextView tvusername;
    private EditText tvinputusername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        tvforgotpass = findViewById(R.id.forgot_pass);
        tvsubforgotpass = findViewById(R.id.sub_forgot_pass);
        tvusername = findViewById(R.id.username);
        tvinputusername = findViewById(R.id.input_username);
    }
}