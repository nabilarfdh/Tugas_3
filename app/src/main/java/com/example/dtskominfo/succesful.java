package com.example.dtskominfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class succesful extends AppCompatActivity {
    private TextView tvsuccess;
    private TextView tvtextsuccess;
    private ImageView ivsuccess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_succesful);
        tvsuccess = findViewById(R.id.success);
        tvtextsuccess = findViewById(R.id.text_success);
        ivsuccess = findViewById(R.id.image_succes);
    }
}