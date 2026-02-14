package com.example;

public class ContaBancaria implements Banco{
    //ATRIBUTOS
    private double saldo;

    //CONSTRUTOR
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    //Métodos
    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public double sacar(double valor){
 
        if (valor <= saldo){
            saldo -= valor;
            return valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return 0;
        }
    }

    @Override
    public void verSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }
    
}
