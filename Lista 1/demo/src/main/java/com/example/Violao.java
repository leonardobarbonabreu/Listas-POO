package com.example;

public class Violao extends InstrumentoMusical{
    //ATRIBUTOS
    private int numeroCordas;

    //COSNTRUTOR
    public Violao(String nome, String tipo, String material, double preco, int numeroCordas){
        super(nome, tipo, material, preco);
        this.numeroCordas = numeroCordas;
    }

    @Override
    public void tocar(){
        System.out.println("Tocando violão");
    }
}
