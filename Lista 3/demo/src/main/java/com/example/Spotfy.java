package main.java.com.example;

public class Spotfy implements Musica{
    @Override
    public void play() {
        System.out.println("Tocando música no Spotfy...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música no Spotfy...");
    }

    @Override
    public void stop() {
        System.out.println("Parando de tocar música no Spotfy...");
    }
}
