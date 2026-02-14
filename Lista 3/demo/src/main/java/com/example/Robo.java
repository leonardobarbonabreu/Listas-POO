package main.java.com.example;

public class Robo implements Movivel{
    @Override
    public void moverParaFrente() {
        System.out.println("O robô está se movendo para frente...");
    }

    @Override
    public void moverParaTras() {
        System.out.println("O robô está se movendo para trás...");
    }

}
