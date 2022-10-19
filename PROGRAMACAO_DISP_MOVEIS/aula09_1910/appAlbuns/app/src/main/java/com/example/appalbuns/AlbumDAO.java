package com.example.appalbuns;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class AlbumDAO {
    private Conexao conexao;
    private SQLiteDatabase banco;

    public AlbumDAO(Context context) {
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir(Album album){
        ContentValues values = new ContentValues();
        values.put("nome",album.getNome());
        values.put("ano",album.getAno());
        values.put("banda",album.getBanda());
        return banco.insert("albuns",null,values);
    }

    public List<Album> obterTodos(){
        List<Album> albuns = new ArrayList<>();
        Cursor cursor = banco.query("albuns",new String[]{"id","nome","ano","banda"},null,null,null,null,"nome");

        while(cursor.moveToNext()){
            Album a = new Album();
            a.setId(cursor.getInt(0));
            a.setNome(cursor.getString(1));
            a.setAno(cursor.getString(2));
            a.setBanda(cursor.getString(3));
            albuns.add(a);
        }

        return albuns;
    }
}
