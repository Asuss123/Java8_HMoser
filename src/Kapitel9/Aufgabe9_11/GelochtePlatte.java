package Kapitel9.Aufgabe9_11;

/**
 * Created by Moser Harry on 11.10.2016.
 */
public class GelochtePlatte extends MetallPlatte {

    private int anzahlLoecher =0;
    private double lochLaenge;
    private double lochBreite;
    private MetallPlatte[] loch;

    public GelochtePlatte(double laenge, double breite, int anzahlLoecher) {
        super(laenge, breite);
        loch       = new MetallPlatte[anzahlLoecher];
        lochLaenge = laenge/anzahlLoecher/2;
        lochBreite = breite/anzahlLoecher/2;
    }

    public void neuesLochStanzen(){
        if (anzahlLoecher < loch.length){
            loch [anzahlLoecher] = new MetallPlatte(lochLaenge, lochBreite);
            anzahlLoecher++;
            System.out.println("Loch Nr. " + anzahlLoecher + " gestanzt");
        }
    }

    public double flaeche(){
       double f = super.flaeche();
        for (int i=0; i < anzahlLoecher; i++)
            f = f - loch[i].flaeche();
        return f;

    }
}
