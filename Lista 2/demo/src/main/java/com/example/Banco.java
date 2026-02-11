package com.example;

public abstract class Banco {
    //ATRIBUTOS
    protected double saldo;

    //CONSTRUTOR
    public Banco(double saldo){
        this.saldo = saldo;
    }

    //Métodos
    public void depositar(double valor){
        saldo += valor;
    }

    public abstract void realizarTransacao(double valor);
    
}
