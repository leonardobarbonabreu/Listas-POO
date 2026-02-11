package main.java.com.example;

public class CartaoCredito extends Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Realizando pagamento com cartão de crédito no valor de R$ " + valor);
    } 
}
