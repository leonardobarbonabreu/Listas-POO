package com.example;

public class Guitarra extends InstrumentoMusical{
    //ATRIBUTOS
    private int numeroCordas;

    //COSNTRUTOR
    public Guitarra(String nome, String tipo, String material, double preco, int numeroCordas){
        super(nome, tipo, material, preco);
        this.numeroCordas = numeroCordas;
    }

    @Override
    public void tocar(){
        System.out.println("Tocando violão");
    }
}
