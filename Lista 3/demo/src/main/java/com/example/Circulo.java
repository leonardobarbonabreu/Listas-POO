package com.example;

public class Circulo implements FormaGeometrica{

    public float raio;
    
    @Override
    public double calcularArea(){
        return 3.1419 * (this.raio * this.raio);
    }

}
