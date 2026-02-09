package main.java.com.example;

public class Circulo implements FormaGeometrica{

    public float raio;
    
    @Override
    public float calcularPerimetro(){
        return 2 * 3.1419 * this.raio;
    }

    @Override
    public float calcularArea(){
        return 3.1419 * (this.raio * this.raio);
    }

}
