package Kapitel8.Aufgabe8_16;

/**
 * Created by Moser Harry on 30.09.2016.
 */
public class Glasboden {
    private double radius;

    public Glasboden (double r) {
        radius = r;
    }
    public void verkleinern (double x) {
        // verkleinert den Radius des Glasboden-Objekts um x
        radius  = radius - x;
    }
    public double flaeche () {
        // liefert die Flaeche des Glasboden-Objekts
        return Math.PI * radius * radius;
    }
    public double umfang () {
        // liefert den Umfang der Glasboden-Objekts
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        // liefert die String-Darstellung des Glasboden-Objekts
        return "B(r=" + radius + ")";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
