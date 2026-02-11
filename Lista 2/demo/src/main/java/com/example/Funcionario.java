package com.example;

public abstract class Funcionario {
    private String nome;
    private double salario;

    //CONSTRUTORES
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    //Métodos
    public abstract double pagarSalario(double salario);

    public double calcularBonificacao(double valor){
        return valor * 0.01; //Um porcento do salario   
    }

    public void baterPonto(){
         System.out.println("Funcionário " + nome + " bateu o ponto às " + java.time.LocalTime.now() );   
    }
}
