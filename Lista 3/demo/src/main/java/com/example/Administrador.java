package main.java.com.example;

public class Administrador implements Autenticavel{

    @Override
    public void login() {
        System.out.println("Efetuando login no sistema de administrador DE TUDO...");
    }

    @Override
    public void logout() {
        System.out.println("Efetuando logout no sistema de administrador DE TUDO...");
    }
    
}
