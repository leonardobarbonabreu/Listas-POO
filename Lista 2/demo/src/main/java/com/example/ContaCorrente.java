package main.java.com.example;

public class ContaCorrente extends ContaBancaria {
    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public double sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return 0;
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }    

    }


}
