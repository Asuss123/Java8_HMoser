package Kapitel9.Aufgabe9_12;

import Prog1Tools.IOTools;


/**
 * Created by Moser Harry on 16.10.2016.
 */
public class DSpiel {

    public static int zaehler = 1;

    public static void main(String[] args) {
        //**Eingabe Beute*/
        System.out.println("Positionieren sie die Beute");
        char spalte  = IOTools.readChar  ("Spalte (A-H) ihrer Figur: ");
        int zeile    = IOTools.readInt   ("Zeile (1-8) ihrer Figur : ");
        String farbe = IOTools.readString("Farbe ihrer Figur       : ");


        /**Bildschirm wird mit statischer Methode, Bildschirm.löscher, gelöscht*/

        System.out.println();
        Bildschirm.loeschen();
        System.out.println("!!Der Bildschirm wurde gelöscht!!");
        System.out.println();

        /**Beute Objekt erzeugt*/
        DameFigur beute = new DameFigur(spalte, zeile, farbe);

        /**Eingabe Jaeger*/
        System.out.println();
        System.out.println("Die Beute steht. Positionieren sie den Jaeger");
        System.out.println("\n");
        char    spalte1 =   IOTools.readChar  ("Spalte (A-H) ihrer Figur: ");
        int     zeile1  =   IOTools.readInt   ("Zeile (1-8) ihrer Figur : ");
        String  farbe1  =   IOTools.readString("Farbe ihrer Figur       : ");

        /**Jaeger Objekt wird erzeugt*/
        DameFigur jaeger = new DameFigur(spalte1, zeile1, farbe1);

        //Position vom Jaeger Objekt wird ausgegeben
        System.out.println();
        System.out.println(jaeger);
        System.out.println();

        /**Ueberpruehfung ob Jaeger und Beute schon auf dem gleichen Feld sind*/
        if (jaeger.trifft(beute)){
            System.out.println("Jaeger hat Beute gefangen. Jaeger ist Sieger");
            System.out.println("bei " + DSpiel.zaehler + ". Versuch geschafft");
            System.exit(-1);
        }
        else {
            System.out.println("Die Beute-Figur steht wo anders");
            System.out.println();
            System.out.println();
        }

        System.out.println("Sie haben nun 10 Zuege um die Beute-Figur zu treffen");
        System.out.println("Bewegen sie ihre " + jaeger.getFarbe() + "e Dame auf feld " + jaeger.getxPos() + jaeger.getyPos() );

        /**Schleife um maximale Versuche zu begrenzen*/
        while (zaehler <= 10){

            /**Eingabe Richtung vom Objekt*/
            System.out.println("Wollen sie Wagrecht (-), Senkrecht (|)");
            char richtung = IOTools.readChar("\t oder diagonal (\\,/) ziehen?");
            int anzahl    = IOTools.readInt("Wie viele Felder? :");

            /**Abfahrge ob Jaeger Beute trifft*/
            jaeger.ziehen(richtung, anzahl);
            if (jaeger.trifft(beute)) {
                System.out.println("Jaeger hat Beute gefangen. Jaeger ist Sieger");
                System.out.println(beute);
                System.out.println(jaeger);
                System.out.println("bei " + DSpiel.zaehler + ". Versuch geschafft");
                System.exit(-1);
            }
            else {
                System.out.println();
                System.out.println("Die Beute-Figur steht wo anders");
                System.out.println(jaeger);
                zaehler++;
            }

        }

        /**While Schleife beendet Beute ist Sieger*/
        System.out.println();
        System.out.println(beute);
        System.out.println("Beute hat gewonnen");

    }

}
