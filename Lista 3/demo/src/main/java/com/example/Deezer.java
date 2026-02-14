package main.java.com.example;

public class Deezer implements Musica{
    @Override
    public void play() {
        System.out.println("Tocando música no Deezer...");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música no Deezer...");
    }

    @Override
    public void stop() {
        System.out.println("Parando de tocar música no Deezer...");
    }
}
