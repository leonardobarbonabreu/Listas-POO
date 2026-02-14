package main.java.com.example;

public interface Imprimivel {
    public void imprimir();
    public default void mostrarNoMonitor() {
        System.out.println("Exibindo no monitor");
    }
}
