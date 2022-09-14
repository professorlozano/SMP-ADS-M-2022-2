package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referência ao botão da activity_main.xml
        botaoPrincipal = findViewById(R.id.btnPrimeiraTela);

        //ação do botão para a próxima activity
        botaoPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //instanciar a segunda tela
                Intent obj_intencao = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(obj_intencao);
            }
        });

    }
}