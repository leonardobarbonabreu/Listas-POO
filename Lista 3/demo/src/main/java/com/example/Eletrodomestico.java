package main.java.com.example;

public interface Eletrodomestico{
    //Metodo
    public void ligar();
    public void desligar();
    public default void verificarStatus(){
        System.out.println("Eletrodoméstico funcionando - OK");
    }
}
