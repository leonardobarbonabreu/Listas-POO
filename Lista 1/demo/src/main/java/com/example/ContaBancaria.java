package com.example;

public class ContaBancaria {
    //ATRIBUTOS
    private double saldo;

    //CONSTRUTOR
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    //Métodos
    public void depositar(double valor){
        saldo += valor;
    }

    public double sacar(double valor){
 
        if (valor <= saldo){
            saldo -= valor;
            return valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return 0;
        }
    }

    
}
