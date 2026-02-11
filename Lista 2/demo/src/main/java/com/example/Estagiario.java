package com.example;

public class Estagiario extends Funcionario{
    
    public Estagiario(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double pagarSalario(double salario){
        return salario - (salario * 0.2);        
    }

}
