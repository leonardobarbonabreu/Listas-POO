package com.example;

import java.time.LocalDate;

public abstract class Veiculo {
    //ATRIBUTOS
    protected String marca;
    protected String modelo;
    protected LocalDate ano;
    protected string cor; 

    //CONSTRUTOR
    public Veiculo(String marca, String modelo, LocalDate ano, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    //Metodos
    public void abastecer(){
        System.out.println("Abastecendo veiculo...");
    }

    //metodo abstrato
    public abstract void mover();

    public void mostrarCor(){
        return this.cor;
    }
}
