package entities;

import enums.Dipartimento;

import java.util.Random;

public class Dirigente extends Dipendente {
    public Dirigente(Dipartimento dipartimento) {
        super(dipartimento);
    }

    @Override
    public double calculateSalary() {
        return new Random().nextDouble(1800, 2500);
    }

    @Override
    public String toString() {
        return "Dirigente{" +
                "matricola=" + matricola +
                ", dipartimento=" + dipartimento +
                ", stipendio=" + stipendio +
                '}';
    }

}
