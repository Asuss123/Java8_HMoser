package Kapitel8.Aufgabe8_13;

/**
 * Created by Moser Harry on 30.09.2016.
 */
public class Fahrzeug {

    private String name;
    private int anzahlReifen;
    private Reifen reifenArt;
    private boolean faehrt;


    public Fahrzeug(String name, int anzahlReifen){
        this.name = name;
        this.anzahlReifen = anzahlReifen;


    }

    public void fahreLos(){
        faehrt = true;
    }

    public void halteAn(){
        faehrt = false;
    }

    public String status(){

        if (faehrt)
            System.out.print("Das Auto faehrt. ");

        else
            System.out.print("Das Auto steht. ");

      return ("Es heisst " + name +".  Das Auto hat " + anzahlReifen + " Reifen. " + "Der Druck beträgt " );
    }
}
