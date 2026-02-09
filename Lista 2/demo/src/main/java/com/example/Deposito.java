package main.java.com.example;

public class Deposito implements Banco{
    @Override
    public void realizarTransacao(double valor){
       if (valor > 0) {
          this.saldo = this.saldo + valor; 
       } else {
          System.out.println("Informe um valor válido");
       }
    };
}
