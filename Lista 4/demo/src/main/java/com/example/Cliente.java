package com.example;

public class Cliente extends Pessoa{
    

    public Cliente(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if (idade <= 0) {
            System.out.println("Falha: Idade não pode ser inferior ou igual a zero.");
            return;
        }

        this.idade = idade;
    }
    
    public boolean validarIdade(){
        if(this.idade > 31){
            return true;
        }else{
            return false;
        }
    }

}
