package main.java.com.example;

public class Relogio implements Horario{

    @Override
    public void exibirHorario(){
        System.out.println(java.time.LocalTime.now());
    }
}
