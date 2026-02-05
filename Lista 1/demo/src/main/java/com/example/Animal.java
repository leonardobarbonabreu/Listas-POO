package com.example;

public abstract class Animal {
    //ATRIBUTOS
    private String nome;
    private int idade;

    //CONSTRUTOR
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void emitirSom();
    
    public void brigar(Animal outroAnimal){
        System.out.println(this.nome + " está brigando com " + outroAnimal.nome + ": ");
        emitirSom();
    }
}
