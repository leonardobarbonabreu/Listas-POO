package main.java.com.example;

public class Pix implements Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagando com Pix...");
    }

    @Override
    public void cancelar() {
        System.out.println("Pagamento com Pix cancelado.");         
    }    
}
