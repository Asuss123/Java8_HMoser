package Kapitel8.Aufgabe8_5;

/**
 * Created by Moser Harry on 01.10.2016.
 */
class Hund extends Fuchs {
    Maus m = new Maus();
    Ratte r = new Ratte();
    Hund() {
        System.out.println("Hund");
    }
    public static void main(String[] args) {
        new Hund();
    }
}
/* Als erstes wird der Hund Konstruktor aufgerufen.
/*   Da Hund extends Fuchs und Fuchs extends Katze ist,
/*   wird als erstes "Katze" ausgegeben. An zweiter Stelle kommt die Ausgabe "Fuchs".
/*   Konstruktor Maus wird aufgerufen. "Maus" wird ausgegeben.
/*   Konstruktor Ratte wird aufgerufen. Da Ratte extens Maus wird "Maus" ausgegeben.
/*   Danach "Ratte", zu guter letzt wird noch "Hund" ausgegeben.
 */