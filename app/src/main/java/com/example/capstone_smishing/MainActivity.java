package com.example.capstone_smishing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_url;
    Button btn_search;
    Button btn_test;
    String str;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_url = findViewById(R.id.et_url);
        btn_search = findViewById(R.id.btn_search);
        btn_test = findViewById(R.id.btn_test);

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_url.setText("박신영");
            }
        });

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = et_url.getText().toString(); //입력한 문자열을 str에 담아서 가져옴
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("str", str); // str 인텐트
                startActivity(intent); // 액티비티 화면이동.
            }
        });


    }
}