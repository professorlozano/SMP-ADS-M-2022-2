package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView res;
    private EditText numero1;
    private EditText numero2;
    private Button bCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res = findViewById(R.id.tvResultado);
        numero1 = findViewById(R.id.edtNum1);
        numero2 = findViewById(R.id.edtNum2);
        bCalcular = findViewById(R.id.btnCalcular);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int n1 = Integer.parseInt(String.valueOf(numero1.getText()));
               int n2 = Integer.parseInt(String.valueOf(numero2.getText()));
               int resultado = n1 + n2;
               res.setText("Resultado: "+resultado);
            }
        });
    }
}