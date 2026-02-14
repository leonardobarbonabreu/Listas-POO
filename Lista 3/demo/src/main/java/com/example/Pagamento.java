package main.java.com.example;

public interface Pagamento {
    public void pagar();

    public default void cancelar() {
        System.out.println("Pagamento cancelado.");         
    }
}
