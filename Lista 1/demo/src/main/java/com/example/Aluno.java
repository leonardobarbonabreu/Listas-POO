package com.example;

public class Aluno extends Pessoa{
    //ATRIBUTOS
    private String curso;
    private double mensalidade;

    //CONTRUTOR
    public Aluno(String nome, int idade, String curso, double mensalidade){
        super(nome, idade);
        this.curso = curso;
        this.mensalidade = mensalidade;
    }
}
