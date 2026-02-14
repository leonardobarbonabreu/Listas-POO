package com.example;

import main.java.com.example.ControleRemoto;
import main.java.com.example.Eletrodomestico;

public class Televisao implements Eletrodomestico, ControleRemoto{

    @Override
    public void ligar(){
        System.out.println("Ligando Televisao");
    }

    @Override
    public void desligar(){
        System.out.println("Desligando Televisao");
    }

    @Override
    public void aumentarVolume(){
        System.out.println("Aumentando volume da televisao");
        
    }

    @Override
    public void diminuirVolume(){
        System.out.println("Diuminuindo volume da televisao");
    }
}
