package com.example;

import java.time.LocalDate;

public class Veiculo {
    //ATRIBUTOS
    protected String marca;
    protected String modelo;
    protected LocalDate ano;

    //CONSTRUTOR
    public Veiculo(String marca, String modelo, LocalDate ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    //Metodos
    public void abastecer(){
        System.out.println("Abastecendo veiculo...");
    }
}
