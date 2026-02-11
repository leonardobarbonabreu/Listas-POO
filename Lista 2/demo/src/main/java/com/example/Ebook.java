package main.java.com.example;

public class EBook extends Livro {
    @Override
    public void abrir() {
        System.out.println("Abrindo livro no kindle");
    }
}
