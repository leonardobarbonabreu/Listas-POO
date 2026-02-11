package com.example;

public class Gerente extends Funcionario{
    
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double pagarSalario(double salario){
        return salario + (salario * 0.20);        
    }

    @Override
    public double calcularBonificacao(double valor){
        return valor * 0.05; //Cinco porcento do salario   
    }

}
