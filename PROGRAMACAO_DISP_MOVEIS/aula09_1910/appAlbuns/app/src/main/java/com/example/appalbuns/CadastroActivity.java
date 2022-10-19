package com.example.appalbuns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    private Button btnListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        btnListar = findViewById(R.id.btnListar);

        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CadastroActivity.this,Listagem.class);
                startActivity(intent);
            }
        });


    }


    public void inserir(View view){
        EditText etNome = findViewById(R.id.editTextNome);
        String nome = etNome.getText().toString();

        EditText etAno = findViewById(R.id.editTextAno);
        String ano = etAno.getText().toString();

        EditText etBanda = findViewById(R.id.editTextBanda);
        String banda = etBanda.getText().toString();

        Album album = new Album(nome,ano,banda);
        AlbumDAO dao = new AlbumDAO(this);

        long id = dao.inserir(album);

        Toast.makeText(this,"Album inserido com ID: "+ id,Toast.LENGTH_SHORT).show();
    }
}