package main.java.com.example;

public class Temperatura implements Conversor{
    @Override
    public double converter(double valor) {
        return (valor * 1.8) + 32;
    }
}
