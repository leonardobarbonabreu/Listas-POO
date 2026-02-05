package com.example;

public class Dono extends Pessoa{
    //ATRIBUTOS
    private Carro carro;

    //CONSTRUTOR
    public Dono(String nome, int idade, Carro carro){
        super(nome, idade);
        this.carro = carro;
    }

}
