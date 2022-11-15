package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvExample = findViewById(R.id.tvExample);
        EditText etAnswer = findViewById(R.id.etAnswer);
        Button btAnswer = findViewById(R.id.btAnswer);
        TextView tvWrongAnswer = findViewById(R.id.tvWrongAnswer);
        TextView tvRightAnswer = findViewById(R.id.tvRightAnswer);

        tvExample.setText("20 + 5 = ?");

        btAnswer.setOnClickListener(view -> {
            String answer = etAnswer.getText().toString();

            if (!answer.equals("") & answer.equals("25")) {
                tvRightAnswer.setVisibility(View.VISIBLE);
                tvWrongAnswer.setVisibility(View.GONE);
            } else {
                tvRightAnswer.setVisibility(View.GONE);
                tvWrongAnswer.setVisibility(View.VISIBLE);
            }
        });
    }
}