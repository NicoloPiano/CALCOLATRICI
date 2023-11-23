package com.example.calcolatrici;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1;
    private EditText n2;
    private TextView Result;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        Result = findViewById(R.id.Result);



        final Button buttonSomma = findViewById(R.id.btnSomma);
        buttonSomma.setOnClickListener(v -> {

            String strNum1 = n1.getText().toString();
            String strNum2 = n2.getText().toString();
            int n1 = Integer.parseInt(strNum1);
            int n2 = Integer.parseInt(strNum2);
            int res = n1 + n2;
            String strStr = String.valueOf(res);
            Result.setText(strStr);
        });

        final Button buttonDifferenza = findViewById(R.id.btnDifferenza);
        buttonDifferenza.setOnClickListener(v -> {

            String strNum1 = n1.getText().toString();
            String strNum2 = n2.getText().toString();
            int n1 = Integer.parseInt(strNum1);
            int n2 = Integer.parseInt(strNum2);
            int res = n1 - n2;
            String strStr = String.valueOf(res);
            Result.setText(strStr);
        });

    }

}