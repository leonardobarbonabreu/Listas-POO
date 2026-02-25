package com.example;

public abstract class Pessoa implements Entidade{
    protected String nome;
    protected int idade;

    @Override
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
