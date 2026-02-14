package main.java.com.example;

public interface Animal {
    public void comer();
    public default void dormir() {
        System.out.println("Zzz...");
    }
}
