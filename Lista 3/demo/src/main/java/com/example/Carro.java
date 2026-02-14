package com.example;

import java.time.LocalDate;

public class Carro implements Veiculo {
    //ATRIBUTOS
    private static int countCarro = 0;

    //CONSTRUTOR
    public Carro(String marca, String modelo, LocalDate ano, String cor){
        super(marca, modelo, ano, cor);

        countCarro++;
    }

    //GETTERS E SETTERS
    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public LocalDate getAno(){
        return ano;
    }

    public void setMarca(String marca){
        this.marca = marca;        
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(LocalDate ano){
        this.ano = ano;        
    }

    @Override
    public void acelerar(){
        System.out.println("Carro acelerando");
    }
}
