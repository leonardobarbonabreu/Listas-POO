package com.example;

public class Funcionario extends Pessoa{
    private double salario;
    
    public Funcionario(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 1500){
            System.out.println("Erro: Salário inferior ao salário mínimo - " + getSalario());
            return;
        }
        
        this.salario = salario;
    }
}
