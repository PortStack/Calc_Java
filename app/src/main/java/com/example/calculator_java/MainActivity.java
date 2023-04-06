package com.example.calculator_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private double storedValue;
    private char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);

    }

    public void onClick(View view){

        String current = text.getText().toString();

        switch (view.getId()) {
            case R.id.num_0:
                text.setText(current + "0");
                break;
            case R.id.num_1:
                text.setText(current + "1");
                break;
            case R.id.num_2:
                text.setText(current + "2");
                break;
            case R.id.num_3:
                text.setText(current + "3");
                break;
            case R.id.num_4:
                text.setText(current + "4");
                break;
            case R.id.num_5:
                text.setText(current + "5");
                break;
            case R.id.num_6:
                text.setText(current + "6");
                break;
            case R.id.num_7:
                text.setText(current + "7");
                break;
            case R.id.num_8:
                text.setText(current + "8");
                break;
            case R.id.num_9:
                text.setText(current + "9");
                break;
            case R.id.dot:
                text.setText(current + ".");
                break;
            case R.id.plus:
                if (current.equals("")) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하시오.", Toast.LENGTH_SHORT).show();
                }
                else {
                    storedValue = Double.parseDouble(current);
                    operator = '+';
                    text.setText("");
                    break;
                }
            case R.id.minus:
                if (current.equals("")) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하시오.", Toast.LENGTH_SHORT).show();
                }
                else {
                    storedValue = Double.parseDouble(current);
                    operator = '-';
                    text.setText("");
                    break;
                }
            case R.id.mul:
                if (current.equals("")) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하시오.", Toast.LENGTH_SHORT).show();
                }
                else {
                    storedValue = Double.parseDouble(current);
                    operator = '*';
                    text.setText("");
                    break;
                }
            case R.id.div:
                if (current.equals("")) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하시오.", Toast.LENGTH_SHORT).show();
                }
                else {
                    storedValue = Double.parseDouble(current);
                    operator = '÷';
                    text.setText("");
                    break;
                }
            case R.id.del:
                text.setText("");
                storedValue = 0.0;
                break;
            case R.id.ok:
                if (current.equals("")) {
                    Toast.makeText(getApplicationContext(), "숫자를 입력하시오.", Toast.LENGTH_SHORT).show();
                }
                else {
                    double result = 0;
                    double thisValue = Double.parseDouble(text.getText().toString());
                    switch (operator){
                        case '+':
                            result = storedValue + thisValue;
                            break;
                        case '-':
                            result = storedValue - thisValue;
                            break;
                        case '*':
                            result = storedValue * thisValue;
                            break;
                        case '÷':
                            result = storedValue / thisValue;
                            break;
                    }
                    text.setText("" + result);
                    storedValue = 0.0;
                    break;
                }
        }
    }
}