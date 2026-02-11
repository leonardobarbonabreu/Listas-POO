package com.example;

import java.time.LocalDate;

public class Bicicleta extends Veiculo{
    
    public Bicicleta(String marca, String modelo, LocalDate ano, String cor){
        super(marca, modelo, ano, cor);
    
    }    
    
    @Override
    public void mover(){
        System.out.println("Bicicletando na moral");
    }
}
