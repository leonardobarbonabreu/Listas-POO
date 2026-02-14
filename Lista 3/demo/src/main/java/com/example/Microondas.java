package com.example;

import main.java.com.example.ControleRemoto;
import main.java.com.example.Eletrodomestico;

public class Microondas implements Eletrodomestico{

    @Override
    public void ligar(){
        System.out.println("Ligando Microondas");
    }

    @Override
    public void desligar(){
        System.out.println("Desligando Microondas");
    }

    @Override
    public void verificarStatus(){
        System.out.println("Microondas funcionando - OK");
    }

} 
