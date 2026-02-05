package com.example;

import java.time.LocalDate;

public class CarroEletrico extends Carro {
    //CONSTRUTOR
    public CarroEletrico(String marca, String modelo, LocalDate ano){
        super(marca, modelo, ano);        
    }

    @Override
    public void abastecer(){
        System.out.println("Carregando carro elétrico...");
    }
    
}
