/**
 * Created by Moser Harry on 28.09.2016.
 */
package Kapitel8.Aufgabe8_10;

import Prog1Tools.IOTools;


class Punkt {

    private double x;
    private double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void read() {
        x = IOTools.readDouble("x-Koordinate: ");
        y = IOTools.readDouble("y-Koordinate: ");
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
