package main.java.com.example;

public class BoletoBancario extends Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Realizando pagamento do boleto bancário no valor de R$ " + valor);
    } 
}
