package main.java.com.example;

public class Esfera extends Forma3D{
    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }

    @Override
    public double calcularVolume() {
        return 4.0/3.0 * Math.PI * Math.pow(raio, 3);
    }
}
