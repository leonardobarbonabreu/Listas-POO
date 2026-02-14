package com.example;

import main.java.com.example.Eletrodomestico;

public class Geladeira implements Eletrodomestico{

    @Override
    public void ligar(){
        System.out.println("Ligando Geladeira");
    }

    @Override
    public void desligar(){
        System.out.println("Desligando Geladeira");
    }

}
