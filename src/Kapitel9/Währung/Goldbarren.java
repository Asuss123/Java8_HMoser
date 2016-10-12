package Kapitel9.Währung;

/**
 * Created by Moser Harry on 09.10.2016.
 */
public class Goldbarren implements Wertgegenstand{

    //Wie viel ist Gold Wert
    public static double preisProGrammInGold = 60;

    //Das Gewicht vom Gold
    private double gewicht;


    //Konstruktor Gewicht in Gramm
    public Goldbarren(double gewichtInGramm){
        this.gewicht = gewichtInGramm;
    }
    //Interface Währung.Wertgegenstand hinzu gefühgt
    public Waehrung wert(){
        return new USDollar(gewicht * preisProGrammInGold);
    }


}


