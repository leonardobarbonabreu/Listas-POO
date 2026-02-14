package main.java.com.example;

public interface OperacoesMatematicas {
    public double somar(double a, double b);
    public double subtrair(double a, double b);
    public double multiplicar(double a, double b);
    public double dividir(double a, double b);
    public default double potencia(double a, double expo){
        return Math.pow(a, expo);
    }
}
