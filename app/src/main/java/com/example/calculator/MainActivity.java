package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    EditText num1, num2;
    TextView ans;

    int n1,n2;
    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btnAdd);
        b2 = findViewById(R.id.btnSubtract);
        b3 = findViewById(R.id.btnMultiply);
        b4 = findViewById(R.id.btnDivide);
        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        ans = findViewById(R.id.answer);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());

                result =n1+n2;

                ans.setText(String.valueOf(result));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());

                result =n1-n2;

                ans.setText(String.valueOf(result));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());

                result =n1*n2;

                ans.setText(String.valueOf(result));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());

                result =n1/n2;

                ans.setText(String.valueOf(result));
            }
        });

    }
}