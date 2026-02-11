package com.example;

public class Designer extends Funcionario{
    
    public Designer(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public double pagarSalario(double salario){
        return salario - (salario * 0.2);        
    }

    @Override
    public void baterPonto(){
         System.out.println("Designer bateu o ponto às " + java.time.LocalTime.now() );   
    }

}
