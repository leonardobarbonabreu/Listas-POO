package com.example;

public class Gerente implements Funcionario{
    
    @Override
    public double pagarSalario(double salario){
        return salario + (salario * 0.20);        
    }
}
