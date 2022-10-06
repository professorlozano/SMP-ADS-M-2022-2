package com.example.appalbuns;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

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
}
