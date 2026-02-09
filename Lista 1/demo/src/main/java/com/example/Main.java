package com.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //2 Criando carro e imprimindo
        Carro carro = new Carro("chevrollet", "camaro amarelo", LocalDate.of(2007,01,01));
        carro.exibirDetalhes();

        carro.setMarca("Fiat");
        carro.setModelo("uno");
        carro.setAno(LocalDate.of(2001, 12, 10));

        //Exibindo um segundo carro
        carro.exibirDetalhes();

        //Instanciando um dono e relacionando-o com o carro criado anteriormente
        Dono dono = new Dono("Pedro",20, carro);

    }
}