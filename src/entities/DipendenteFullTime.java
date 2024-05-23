package entities;

import enums.Dipartimento;

import java.util.Random;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(Dipartimento dipartimento) {
        super(dipartimento);
    }

    @Override
    public double calculateSalary() {
        return new Random().nextDouble(1200, 1800);
    }

    @Override
    public String toString() {
        return "DipendenteFullTime{" +
                "matricola=" + matricola +
                ", dipartimento=" + dipartimento +
                ", stipendio=" + stipendio +
                '}';
    }

}
