package main.java.com.example;

public class Cubo extends Forma3D{
    private double largura;
    
    //Tres lados iguais
    public Cubo(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(largura, 3);
    }
}
