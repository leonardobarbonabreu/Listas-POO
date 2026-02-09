package com.example;

public class Gato extends Animal{
    //ATRIBUTOS
    private String cor;

    //CONSTRUTOR
    public Gato(String nome, int idade, String cor){
        super(nome, idade);
        this.cor = cor;
    }

    //métodos
    @Override
    public void fazerSom(){
        System.out.println("MIAAAAAAAAAAAAAAAAAAAAAAU");
    }

}
