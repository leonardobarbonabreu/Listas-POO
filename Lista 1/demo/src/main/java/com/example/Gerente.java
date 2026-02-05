package com.example;

public class Gerente extends Funcionario{
    
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double pagarSalario(double salario){
        return salario + (salario * 0.20);        
    }
}
