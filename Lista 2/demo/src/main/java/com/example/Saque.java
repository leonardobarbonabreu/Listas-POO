package main.java.com.example;

public class Deposito implements Saque{
    @Override
    public double realizarTransacao(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            return valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return 0;
        }
    };
}
