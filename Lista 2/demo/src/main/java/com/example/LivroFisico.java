package main.java.com.example;

public class LivroFisico extends Livro {
    @Override
    public void abrir() {
        System.out.println("Abrindo livro físico, para fechá-lo logo em seguida.");
    }
}
