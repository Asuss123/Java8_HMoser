package Kapitel9.Währung; /**
 * Created by Moser Harry on 04.10.2016.
 */
/** Die Währung.Waehrung Europas */
public class Euro extends Waehrung {

    /** Ein Währung.Euro ist soviel Dollar wert */
    private static double kurs=1;

    /** Instanzvariable: Wert in Währung.Euro */
    private double wert;

    /** Konstruktor */
    public Euro(double wert) {
        this.wert=wert;
    }

    /** Deklaration der sonst abstrakten Methode dollarBetrag */
    public double dollarBetrag() {
        return wert*kurs;
    }

    /** Gibt den Wert der Währung.Waehrung in Währung.Euro zurueck */
    public double euroBetrag() {
        return wert;
    }

    /** Zugriff auf die private Klassenvariable */
    public static void setEuroKurs(double Kurs) {
        kurs=Kurs;
    }
    public static double berchneSteuer(Waehrung[] geld){
        double summe = 0;
        for (Waehrung w : geld)
            summe += w.dollarBetrag();
        return summe * 0.08;
    }

    public String toString(){
        return " " + euroBetrag() + " Währung.Euro";
    }


}