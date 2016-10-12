package Kapitel8.Aufgabe8_14;

/**
 * Created by Moser Harry on 02.10.2016.
 */
public class Fahrzeug {

    private String name;
    private int anzahlReifen;
    private Reifen reifenArt;
    private boolean faehrt;

    public Fahrzeug(String name, int anzahlReifen, double druck) {
        this.name = name;
        this.anzahlReifen = anzahlReifen;
        reifenArt = new Reifen(druck);
        faehrt = false;
    }

    public void fahreLos(){
        faehrt = true;
    }

    public void halteAn(){
        faehrt = false;
    }

    public int getAnzahlReifen() {
        return anzahlReifen;
    }



    public void status(){
        if (faehrt){
            System.out.println(name + " faehrt auf " + getAnzahlReifen() + " Reifen mit je " + reifenArt.getReifenDruck()+ "bar");
        }

        else{
            System.out.println(name + " steht auf " + getAnzahlReifen() + " Reifen mit je " + reifenArt.getReifenDruck()+ "bar");
        }
    }





}
