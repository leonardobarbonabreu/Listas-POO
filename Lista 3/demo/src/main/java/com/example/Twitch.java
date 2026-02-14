package main.java.com.example;

public class Twitch implements Transmissivel{

    @Override
    public void iniciarTransmissao() {
        System.out.println("Iniciando transmissão no Twitch...");
    }

    @Override
    public void finalizarTransmissao() {
        System.out.println("Finalizando transmissão no Twitch...");
    }

}
