package com.example;

public class Funcionario {
    private String nome;
    private double salario;

    //CONSTRUTORES
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = pagarSalario(salario);        
    }

    //Métodos
    public double pagarSalario(double salario){
        return salario;
    }
}
