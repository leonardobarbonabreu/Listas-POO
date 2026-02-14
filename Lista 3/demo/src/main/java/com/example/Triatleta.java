package main.java.com.example;

public class Triatleta implements Corredor, Nadador {
    
    @Override
    public void correr(){
        System.out.println("Triatleta correndo");
    }
    
    @Override
    public void nadar(){
        System.out.println("Triatleta nadando");
    }

}
