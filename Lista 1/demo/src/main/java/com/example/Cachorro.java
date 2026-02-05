package com.example;

public class Cachorro extends Animal{
    //ATRIBUTOS
    private String raca;

    //CONSTRUTOR
    public Cachorro(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }

    //Métodos
    @Override
    public void emitirSom(){
        System.out.println("AUAU AUAUAUAUUA AUAU !");
    }
}
