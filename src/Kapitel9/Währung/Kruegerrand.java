package Kapitel9.Währung;

/**
 * Created by Moser Harry on 09.10.2016.
 */
public class Kruegerrand extends Waehrung implements Wertgegenstand {

    //Ein Währung.Kruegerrand ist so viel Dollar wert
    private static double kurs;

    //Instanz Variable von Währung.Kruegerrand
    private double wert;

    //Konstruktor
    public Kruegerrand(double wert){
        this.wert = wert;
    }

    //Deklaration der Methode dollarBetrag() von Währung.Waehrung
    public double dollarBetrag(){
        return wert * kurs;
    }

    //Zugriffs Methode auf die Klassen Variable kurs
    public static void setKurs(double kurs) {
        Kruegerrand.kurs = kurs;
    }

    public Waehrung wert(){
        return this;
    }

}
