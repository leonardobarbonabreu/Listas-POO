package com.example;

public class Jogador extends Personagem{
    @Override
    public void atacar(){
        System.out.println("Jogador ataca relaxamente");        
    }

    public void usarHabilidadeEspecial(){
        System.out.println("Jogador emana aura ilimitada e ataca o código com harding code");
    }
}
