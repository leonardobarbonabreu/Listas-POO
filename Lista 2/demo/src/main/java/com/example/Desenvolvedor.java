package com.example;

public class Desenvolvedor extends Funcionario{
    
    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double pagarSalario(double salario){
        return salario - (salario * 0.2);        
    }

    @Override
    public void baterPonto(){
         System.out.println("Desenvolvedor bateu o ponto às " + java.time.LocalTime.now() );   
    }

}
