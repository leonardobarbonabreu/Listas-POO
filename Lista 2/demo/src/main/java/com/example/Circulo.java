package com.example;

public class Circulo extends FormaGeometrica{

    public float raio;
    
    @Override
    public double calcularPerimetro(){
        return 2 * 3.1419 * this.raio;
    }

    @Override
    public double calcularArea(){
        return 3.1419 * (this.raio * this.raio);
    }

}
