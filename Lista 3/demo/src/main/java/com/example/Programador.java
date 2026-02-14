package com.example;

public class Programador implements Funcionario{

    @Override
    public double pagarSalario(double salario){
        return salario + (salario * 0.10);
    }

}
