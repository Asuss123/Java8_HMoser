package Kapitel9.Währung;

/**
 * Created by Moser Harry on 08.10.2016.
 */
public class NonsensDollar extends USDollar {

    //Knstruktor
    public  NonsensDollar(double wert){
        super (wert);
    }
    //Methode gibt Zufalls Zahl zurück
    public double dollarBetrag(){
        return Math.random();
    }
    //Methode gibt den richtigenDollar betrag zurück
    public double jatztMalImErnst(){
        return super.dollarBetrag();
    }
}
