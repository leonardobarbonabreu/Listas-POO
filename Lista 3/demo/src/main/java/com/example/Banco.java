package main.java.com.example;

public interface Banco {
   public void depositar(double valor);
   public void sacar(double valor);
   public void verSaldo();
   public default double calcularTaxaJuros(double valor, double taxaPerc, int dias){
         return valor * (taxaPerc / 100) * dias;
   }
}
