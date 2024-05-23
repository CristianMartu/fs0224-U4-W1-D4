package entities;

import interfaces.Checkers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Volontario implements Checkers {
    private String name;
    private int age;
    private String CV;

    public Volontario(int age, String name) {
        this.age = age;
        this.name = name;
        this.CV = "CV";
    }

    public Volontario(String name) {
        this(new Random().nextInt(18, 65), name);
    }

    @Override
    public void checkin() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
        System.out.println("Matricola: " + this.name + "  Inizio servizio: " + LocalDateTime.now().format(timeFormatter));
    }

    @Override
    public String toString() {
        return "Volontario{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", CV='" + CV + '\'' +
                '}';
    }
}
