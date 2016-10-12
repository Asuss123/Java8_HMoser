package Kapitel9.Währung;

import Prog1Tools.IOTools;

/**
 * Created by Moser Harry on 04.10.2016.
 */
public class Waehrungskalkulator {

    public static void main(String[] args) {

        //Instanz Variablen
        double dmBetrag;
        Euro betrag;
        Lire lire;
        France franc;

        //Eingabe Tastatur und Ob jekt erzeugung in Währung.DM
        dmBetrag = IOTools.readDouble( "Währung.DM-Betrag > " );
        betrag = new DM( dmBetrag );

        //Objekt erzeugung in Landes Währung.Waehrung
        lire  = new Lire ( betrag );
        franc = new France( betrag );

        //Ausgabe
        System.out.println( "in Währung.Euro:  " + betrag.euroBetrag()     );
        System.out.println( "in Währung.Lire:  " + lire.waehrungsBetrag()  );
        System.out.println( "in Franc: " + franc.waehrungsBetrag() );


        //toString Methode ueberschrieben
        System.out.println(new Euro(125));
        System.out.println(new Lire(25000));
        System.out.println(new France(234578));

        //Ueberschreiben von Methoden
        NonsensDollar nonsens = new NonsensDollar(125);
        System.out.println("Nonsens " + nonsens.dollarBetrag() + " Nonsens");
        System.out.println("Richtg ist Dollar Betrag " + nonsens.jatztMalImErnst() + " $ !!!");

        //Dynamisches Binden
        Sohn s = new Sohn();
        s.zeigeVar();
        ((Vater)s).zeigeVar();
        System.out.println("Währung.Sohn : " + s.var);
        System.out.println("Währung.Vater: " + ((Vater)s).var);


        //Statische Steuerberechnung
        Waehrung[] Geld = new Waehrung[3];
        Geld[0] = new USDollar(2500);
        Geld[1] = new Yen(200000);
        Geld[2] = new Lire(20600);

        //Ausgabe der Steuerberechnug
        System.out.print("Die Steuer beträgt: ");
        System.out.println(Euro.berchneSteuer(Geld));

        //toString Methode von Währung.Waehrung wird von Methode Währung.Euro überschrieben
        Lire lire1 = new Lire(25639.01);
        System.out.println(lire1);

        Vater vaeterchen = new Vater();
        Sohn soehnchen = new Sohn();
        System.out.println(vaeterchen instanceof Sohn);
        System.out.println(vaeterchen instanceof Vater);
      //  System.out.println(vaeterchen instanceof Währung.Waehrung); //Ist keine Instanz von Waerung
        System.out.println(vaeterchen instanceof Object);
        System.out.println(soehnchen instanceof Sohn);
        System.out.println(soehnchen instanceof Vater);
        //System.out.println(soehnchen instanceof Währung.Waehrung);  //Ist keine Instanz von Waerung
        System.out.println(soehnchen instanceof Object);


        //Objekte der Instanz Wertgegenstände
        Goldbarren einBarren = new Goldbarren(256.3);
        Kruegerrand.setKurs(2.56);
        Kruegerrand einRand = new Kruegerrand(2369.23);

        System.out.println("Dein Barren hat einen Wert von : " + einBarren.wert());
        System.out.println("Deine Krügerrand haben eine Wert von; " + einRand.dollarBetrag());




    }

}
