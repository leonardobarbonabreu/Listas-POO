package com.example;

public class Saque extends Banco{
    
    public Saque(double saldo){
        super(saldo);
    }   

    @Override
    public void realizarTransacao(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            System.out.println(valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");            
        }
    };
}
