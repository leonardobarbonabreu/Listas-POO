package main.java.com.example;

public class CartaoCredito implements Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagando com cartão de crédito...");
    }

    @Override
    public void cancelar() {
        System.out.println("Pagamento com Cartão de crédito cancelado.");         
    }    
}
