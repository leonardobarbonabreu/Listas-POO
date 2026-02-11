package com.example;

public class Deposito extends Banco{
   
    public Deposito(double saldo){
        super(saldo);
    }   


   @Override
    public void realizarTransacao(double valor){
       if (valor > 0) {
          this.saldo = this.saldo + valor; 
       } else {
          System.out.println("Informe um valor válido");
       }
    };
}
