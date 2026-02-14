package main.java.com.example;

public class UsuarioSistema implements Autenticavel{

    @Override
    public void login() {
        System.out.println("Efetuando login no sistema de usuário...");
    }

    @Override
    public void logout() {
        System.out.println("Efetuando logout no sistema de usuário...");
    }
    
}
