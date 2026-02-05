package com.example;

public class InstrumentoMusical {
    //ATRIBUTOS
    private String nome; 
    private String tipo;
    private String material;
    private double preco;

    //CONSTRUTOR
    public InstrumentoMusical(String nome, String tipo, String material, double preco){
        this.nome = nome;
        this.tipo = tipo;
        this.material = material;
        this.preco = preco;       
    }

    public void tocar(){
        System.out.println("Tocando instrumento musical");
    }
}
