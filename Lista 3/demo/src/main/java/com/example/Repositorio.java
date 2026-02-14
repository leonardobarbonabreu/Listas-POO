package main.java.com.example;

public interface Repositorio<T> {
    public void salvar(T objeto);
    public void buscar(int id);
}
