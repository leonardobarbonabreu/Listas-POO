package com.example;

import java.util.ArrayList;

public class Empresa {
    public ArrayList<Funcionario2> funcionario;
 
    public void listar(){
        for(int i =0; i < this.funcionario.size(); i++){
            Funcionario2 func = this.funcionario.get(i);    
            System.out.println(func.getNome()); 
            
        }
    }

}
