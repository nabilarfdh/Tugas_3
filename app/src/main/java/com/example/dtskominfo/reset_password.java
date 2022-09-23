package com.example.dtskominfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class reset_password extends AppCompatActivity {
    private TextView tvresetpass;
    private TextView tvsubresetpass;
    private TextView tvnewcode;
    private EditText etinputcode;
    private TextView tvnewpass;
    private EditText etinputpass;
    private TextView tvconfirmpass;
    private EditText etinputconfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        tvresetpass = findViewById(R.id.reset_pass);
        tvsubresetpass = findViewById(R.id.sub_reset_pass);
        tvnewcode = findViewById(R.id.new_code);
        etinputcode = findViewById(R.id.input_code);
        tvnewpass = findViewById(R.id.new_password);
        etinputpass = findViewById(R.id.input_new_password);
        tvconfirmpass = findViewById(R.id.confirm_password);
        etinputconfirm = findViewById(R.id.input_confirm_password);
    }
}