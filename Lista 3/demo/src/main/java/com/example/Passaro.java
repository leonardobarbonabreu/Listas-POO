package main.java.com.example;

public class Passaro implements Animal, Voador{
    
    @Override
    public void comer() {
        System.out.println("Passaro comendo alpiste sem graça");
    }

    @Override
    public void voar() {
        System.out.println("Passaro voando");
    }

    @Override
    public void dormir() {
        System.out.println("Passaro dormindo no ninho");
    }
}
