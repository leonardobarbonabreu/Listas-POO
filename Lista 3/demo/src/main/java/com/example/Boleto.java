package main.java.com.example;

public class Boleto implements Pagamento {

    @Override
    public void pagar() {
        System.out.println("Pagando com boleto bancário...");
    }

}
