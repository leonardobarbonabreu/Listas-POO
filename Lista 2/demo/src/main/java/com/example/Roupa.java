package main.java.com.example;

public class Roupa extends Estoque{
    //Metodo
    @Override
    public double atualizarQuantidade(double valor){
        this.quantidade += valor;
        return this.quantidade;
    }    
}
