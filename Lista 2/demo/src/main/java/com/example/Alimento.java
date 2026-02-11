package main.java.com.example;

public class Alimento extends Produto{
    //Metodo
    @Override
    public double calcularDesconto(double valor){
        return valor * 0.05; // cinco por cento de desconto
    }    
}
