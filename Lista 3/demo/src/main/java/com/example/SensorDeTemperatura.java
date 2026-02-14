package main.java.com.example;

public class SensorDeTemperatura implements Sensores{
    @Override
    public void medirTemperatura() {
        System.out.println("Medindo a temperatura do ambiente");
    }
}
