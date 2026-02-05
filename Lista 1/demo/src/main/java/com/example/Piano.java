package com.example;

public class Piano extends InstrumentoMusical{
    //ATRIBUTOS
    private int numeroOitavas;
    //CONSTRUTOR
    public Piano(String nome, String tipo, String material, double preco, int numeroOitavas){
        super(nome, tipo, material, preco);
        this.numeroOitavas = numeroOitavas;
    }

    @Override
    public void tocar(){
        System.out.println("Tocando piano");
    }
}
