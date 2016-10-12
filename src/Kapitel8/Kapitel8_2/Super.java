package Kapitel8.Kapitel8_2;

/**
 * Created by Moser Harry on 25.09.2016.
 */
public class Super {

    public String x = "Vor Super-Konstruktor";

    public Super() {
        System.out.println("Super-Konstruktor gestartet.");
        System.out.println(" x = " + x);
        x = "nach Super-Konstuktor";
        System.out.println("Super-Konstruktor beendet.");
        System.out.println(" x = " + x);
    }
}
