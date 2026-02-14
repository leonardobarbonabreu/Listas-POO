package main.java.com.example;

public class Youtube implements Transmissivel{

    @Override
    public void iniciarTransmissao() {
        System.out.println("Iniciando transmissão no YouTube...");
    }

    @Override
    public void finalizarTransmissao() {
        System.out.println("Finalizando transmissão no YouTube...");
    }

}
