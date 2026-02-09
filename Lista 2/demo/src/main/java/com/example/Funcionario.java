package com.example;

public abstract class Funcionario {
    private String nome;
    private double salario;

    //CONSTRUTORES
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = pagarSalario(salario);        
    }

    //Métodos
    public abstract double calcularSalario();


}
