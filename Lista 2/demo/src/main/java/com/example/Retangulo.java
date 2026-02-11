package com.example;

public class Retangulo implements FormaGeometrica{
    
    public float largura;
    public float comprimento;
    
    
    @Override
    public float calcularPerimetro(){
        return (this.comprimento * 2) + (this.largura * 2);
    }

    @Override
    public float calcularArea(){
        return this.comprimento * this.largura;
    }

}
