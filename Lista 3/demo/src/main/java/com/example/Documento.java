package main.java.com.example;

public class Documento implements Imprimivel {

    @Override
    public void imprimir() {
        System.out.println("Imprimindo documento...");
    }

    @Override
    public void mostrarNoMonitor() {
        System.out.println("Exibindo documento no monitor...");
    }
}
