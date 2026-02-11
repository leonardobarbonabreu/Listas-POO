package com.example;

public class Funcionario2 extends Funcionario{
    private String nome;
    private double salario;

    //CONSTRUTORES
    public Funcionario2(String nome, double salario){
        super(nome, salario);
    }

    public String getNome(){
        return this.nome;
    }

    //Métodos
    @Override
    public double pagarSalario(double salario){
        return salario + (salario * 0.20);        
    }

    public double calcularBonificacao(double valor){
        return valor * 0.01; //Um porcento do salario   
    }
}
