package com.example.lab1_baivn1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText txtX, txtY;
    TextView txtResult;
    Button btnPlus, btnMinus, btnMultiply, btnDivision, btn5 ;

    private void innitControl() {
        txtX = findViewById(R.id.txtX);
        txtY = findViewById(R.id.txtY);
        txtResult = findViewById(R.id.txtResult);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivision = findViewById(R.id.btnDivision);
        btn5 = findViewById(R.id.btn5);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x + y;
                txtResult.setText(String.valueOf(result));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x - y;
                txtResult.setText(String.valueOf(result));
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                int result = x * y;
                txtResult.setText(String.valueOf(result));
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int x = Integer.parseInt(txtX.getText().toString());
                int y = Integer.parseInt(txtY.getText().toString());
                double result = (double) x / (double) y;
                txtResult.setText(String.valueOf(result));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        innitControl();
    }
}