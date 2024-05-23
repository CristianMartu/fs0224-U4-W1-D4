package entities;

import java.util.Random;

public class DipendentePartTime extends Dipendente {
    private double hours;
    private double price;

    public DipendentePartTime(Dipartimento dipartimento, double hours, double price) {
        super(dipartimento);
        this.hours = hours;
        this.price = price;
        super.stipendio = calculateSalary();
    }

    public DipendentePartTime(Dipartimento dipartimento) {
        this(dipartimento, Math.random() * 30, new Random().nextDouble(10, 20));
    }

    @Override
    public double calculateSalary() {
        return (this.hours * this.price);
    }

    @Override
    public String toString() {
        return "DipendentePartTime{" +
                "matricola=" + matricola +
                ", hours=" + hours +
                ", price=" + price +
                ", dipartimento=" + dipartimento +
                ", stipendio=" + stipendio +
                '}';
    }

}
