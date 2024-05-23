package entities;

import enums.Dipartimento;
import interfaces.Checkers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public abstract class Dipendente implements Checkers {
    protected int matricola;
    protected double stipendio;
    protected Dipartimento dipartimento;

    public Dipendente(Dipartimento dipartimento) {
        Random rand = new Random();
        this.matricola = rand.nextInt(10000, 50000);
        this.dipartimento = dipartimento;
        this.stipendio = calculateSalary();
    }

    public double getStipendio() {
        return stipendio;
    }

    public abstract double calculateSalary();

    @Override
    public abstract String toString();

    public void checkin() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
        System.out.println("Matricola: " + this.matricola + "  Inizio servizio: " + LocalDateTime.now().format(timeFormatter));
    }
}
