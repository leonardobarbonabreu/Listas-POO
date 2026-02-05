package com.example;

public class Professor extends Pessoa{
    //ATRIBUTOS
    private String disciplina;
    private double salario;

    //CONTRUTOR
    public Professor(String nome, int idade, String disciplina, double salario){
        super(nome, idade);
        this.disciplina = disciplina;        
        this.salario = salario;
    }    

}
