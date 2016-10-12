package Kapitel8.Aufgabe8_13;

/**
 * Created by Moser Harry on 30.09.2016.
 */
public class Reifen {
    private double druck;

    public Reifen(double luftdruck){
        druck = luftdruck;
    }
    public double aktuellerDruck(){
        return druck;
    }

    public double getDruck() {
        return druck;
    }

    public void setDruck(double druck) {
        this.druck = druck;
    }
}

