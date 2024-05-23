import entities.*;
import interfaces.Checkers;

public class Main {
    public static void main(String[] args) {
        DipendenteFullTime dipendente1 = new DipendenteFullTime(Dipartimento.PRODUZIONE);
        DipendentePartTime dipendente2 = new DipendentePartTime(Dipartimento.AMMINISTRAZIONE, 2, 10);
        DipendentePartTime dipendente3 = new DipendentePartTime(Dipartimento.PRODUZIONE);
        Dirigente dipendente4 = new Dirigente(Dipartimento.VENDITE);
        Volontario volontario1 = new Volontario(25, "Davide");
        Volontario volontario2 = new Volontario("Federico");
        Volontario volontario3 = new Volontario("Cristian");
        Volontario volontario4 = new Volontario("Alessio");


        Checkers[] checkers = {dipendente1, dipendente2, dipendente3, dipendente4, volontario4, volontario3, volontario2, volontario1};
        double totalSalary = 0;
        for (Checkers checker : checkers) {
            System.out.println(checker);
            checker.checkin();
            if (checker instanceof Dipendente) {
                totalSalary += ((Dipendente) checker).getStipendio();
            }
            System.out.println();
        }
        System.out.println("Stipendi totali: " + totalSalary);
    }
}