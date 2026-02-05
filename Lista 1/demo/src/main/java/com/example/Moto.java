package com.example;

import java.time.LocalDate;

public class Moto extends Veiculo{
    //ATRIBUTOS
    private int cilindrada;

    //CONSTRUTOR
    public Moto(String marca, String modelo, LocalDate ano, int cilindrada){
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    public int getCilindradas() {
        return cilindrada;
 
    }

    @Override
    public void abastecer(){
        System.out.println("Abastecendo moto com gasolina...");
    }
}
