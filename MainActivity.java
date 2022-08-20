package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView t;
    private TextView T1;
    private TextView T2;
    private TextView T3;
    private TextView T4;
    private TextView T5;
    private TextView T6;
    private TextView T7;
    private EditText ET1;
    private EditText ET2;
    private Button button;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.textView2);
        T1 = findViewById(R.id.textView);
        T2 = findViewById(R.id.textView3);
        T4 = findViewById(R.id.textView6);
         ET1 = findViewById(R.id.editTextNumber);
         ET2 = findViewById(R.id.editTextNumber2);
         button = findViewById(R.id.button);
         T3 = findViewById(R.id.textView5);
         T5 = findViewById(R.id.textView7);
         T6 = findViewById(R.id.textView8);
         T7 = findViewById(R.id.textView9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Submitted", Toast.LENGTH_SHORT).show();
               String s1 =  ET1.getText().toString();
               String s2 = ET2.getText().toString();
               int Sum = Integer.parseInt(s1) + Integer.parseInt(s2);
               int Sub = Integer.parseInt(s1) - Integer.parseInt(s2);
               int Mul = Integer.parseInt(s1) * Integer.parseInt(s2);
               double Div = Integer.parseInt(s1) / Integer.parseInt(s2);
               double Modulus = Integer.parseInt(s1) % Integer.parseInt(s2);
               T3.setText("The Sum Is : " + Sum);
               T4.setText("The Difference Is : "  + Sub);
               T5.setText("The Multiplication Is : " + Mul);
               T6.setText("The Division Is : " + Div);
               T7.setText("The Modulus Is : " + Modulus);
            }
        });
    }
}