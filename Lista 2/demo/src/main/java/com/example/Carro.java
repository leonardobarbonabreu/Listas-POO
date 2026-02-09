package com.example;

import java.time.LocalDate;

public class Carro extends Veiculo {
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

    public static int getCountCarro(){
        return countCarro;
    }

    //Método
    public void exibirDetalhes(){
        System.out.println("Carro " + countCarro + ": marca = " + marca + ", modelo = " + modelo + ", ano = " + ano);
    }

    @Override
    public void abastecer(){
        System.out.println("Abastecendo carro com gasolina...");
    }

    @Override
    public void mover(){
        System.out.println("Carro andando");
    }
}
