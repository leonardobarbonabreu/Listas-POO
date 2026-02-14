package main.java.com.example;

public class Eletrodomestico extends Produto{
    //Metodo
    @Override
    public double calcularDesconto(double valor){
        return valor * 0.12; // doze por cento de desconto
    }    
}
