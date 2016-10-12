package Kapitel8.Aufgabe8_16;

/**
 * Created by Moser Harry on 01.10.2016.
 */
public class TesteTrinkGlas {

    public static void main (String[] args){

        Glasboden b = new Glasboden(100);

        TrinkGlas g = new TrinkGlas(50.0, b);

        while (g.flaeche()< g.fuellMenge()/8){
            g.verkleinern(5.0);
            b.verkleinern(5.0);
            System.out.println("Das Trikglas " + g);
            System.out.println("hat die Innenflaeche " + g.flaeche());
            System.out.println("Und die Füllmenge " + g.fuellMenge());
            System.out.println();
        }
    }
}
