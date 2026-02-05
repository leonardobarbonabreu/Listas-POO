package com.example;

public class Programador extends Empregado{
    //construtor
    public Programador(String nome, double salario){
        super(nome, salario);
    }

    public void funcao(){
        System.out.println("Programar sistemas, e construir integrações entre serviços web");
    }
}
