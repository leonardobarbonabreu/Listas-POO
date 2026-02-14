package main.java.com.example;

public class Cachorro implements Animal{

    @Override
    public void comer() {
        System.out.println("Cachorro comendo ração");
    }

    @Override
    public void dormir() {
        System.out.println("Cão dormindo");
    }
}
