package Kapitel9.Währung; /**
 * Created by Moser Harry on 04.10.2016.
 */

/** Diese KlasseA symbolisiert eine beliebige Währung.Waehrung */
public abstract class Waehrung {

    /** Gibt den Wert des Objekts in US-Dollar zurueck */
    public abstract double dollarBetrag();

    public String toString(){
        return "$" + dollarBetrag();
    }

    public boolean equals(Object obj) {
        if (obj == null)                 // Vergleich mit null-Referenz
            return false;
        if (obj == this )                // Vergleich mit sich selber
            return true;
        if (!obj.getClass().equals(getClass()))   // Datentyp-Vergleich
            return false;

        Waehrung that = (Waehrung) obj;        // Typecast und Inhalts-
        return this.dollarBetrag() == that.dollarBetrag(); // Vergleich
    }

    public int hashCode(){
        return (int) (dollarBetrag()*100);
    }







}