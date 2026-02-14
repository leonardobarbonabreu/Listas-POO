package com.example;

public class Quadrado implements FormaGeometrica{
    
    private float lado;

    @Override
    public float calcularArea(){
        return this.lado * this.lado;
    }

}
