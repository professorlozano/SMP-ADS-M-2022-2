package com.example.appalbuns;

import java.io.Serializable;

public class Album implements Serializable {
    private int id;
    private String nome;
    private String ano;
    private String banda;

    //método construtor recebendo os argumentos nome, ano e banda
    //e passando os mesmos para os respectivos métodos sets
    //que por sua vez fazem a atribuição dos valores aos atributos
    public Album(String nome, String ano, String banda) {
        //this.nome = nome;
        //this.ano = ano;
        //this.banda = banda;
        setNome(nome);
        setAno(ano);
        setBanda(banda);
    }

    //método construtor vazio
    public Album() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String toString(){
        return nome;
    }
}
