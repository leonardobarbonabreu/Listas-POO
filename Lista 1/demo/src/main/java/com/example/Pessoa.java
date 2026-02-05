package com.example;

public class Pessoa {
    //ATRIBUTOS
    private String nome;
    private int idade;

    //CONSTRUTOR
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Métodos
    public boolean maiorIdade(){
        return idade >= 18; 
    }
}
