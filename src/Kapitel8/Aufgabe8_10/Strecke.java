package Kapitel8.Aufgabe8_10;

/**
 * Created by Moser Harry on 28.09.2016.
 */

class Strecke {

    private Punkt p;
    private Punkt q;

    public Strecke(Punkt p, Punkt q) {
        this.p = p;
        this.q = q;
    }

    public void read() {
        System.out.println("Punkt p der Strecke eingeben");
        p.read();
        System.out.println("Punkt q der Strecke eingeben");
        q.read();
    }

    public double getLaenge() {
        double xdiff = p.getX() - q.getX();
        double ydiff = p.getY() - q.getY();
        return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    }

    public String toString() {
        return p + "_" + q;
    }

}