package main.java.com.example;

public class ContaPoupanca extends ContaBancaria {
    private double poupanca;

    public ContaPoupanca(double poupanca) {
        this.poupanca = poupanca;
    }

    @Override
    public double sacar(double valor) {
        if (valor <= poupanca) {
            poupanca -= valor;
            return valor;
        } else {
            System.out.println("Saldo da poupança insuficiente para saque.");
            return 0;
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            poupanca += valor;
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }    

    }


}
