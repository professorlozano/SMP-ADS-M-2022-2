package com.example.appalbuns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Listagem extends AppCompatActivity {

    private ListView listView;
    private AlbumDAO dao;
    private List<Album> albuns;
    private List<Album> albunsFiltrados = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem);

        listView = findViewById(R.id.listaAlbuns);
        dao = new AlbumDAO(this);
        albuns = dao.obterTodos();
        albunsFiltrados.addAll(albuns);
        ArrayAdapter<Album> adaptador = new ArrayAdapter<Album>(this, android.R.layout.simple_list_item_1, albuns);
        listView.setAdapter(adaptador);
    }
}