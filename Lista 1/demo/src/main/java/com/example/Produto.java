package com.example;

public class Produto {
    //ATRIBUTOS
    private String nome;
    private double preco;
    private int quantidade;

    //CONSTRUTOR
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Método
    public double calcularValorEstoque(){
        return preco * quantidade;
    }
    
}
