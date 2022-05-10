package com.example.capstone_smishing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    TextView tv_suburl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_suburl = findViewById(R.id.tv_suburl);

        Intent intent = getIntent();
        String str;
        str = intent.getStringExtra("str"); // Main에서 가져온 문자열을 str에 넣음

        tv_suburl.setText(str); // tv_suburl에 str을 넣음
    }
}