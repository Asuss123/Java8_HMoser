package Kapitel9.Aufgabe9_12;

/**
 * Created by Moser Harry on 16.10.2016.
 */
public class DameFigur extends SpielFigur {

    private final String name  = "Dame";

    /**Konstruktor erzeugt ein Dame Objekt mit Pos x, y, und Farbe*/
    public DameFigur(char x, int y, String f) {
        super(x, y, f);
    }

    /*Methode um Dame auf Feld zu bewegen*/
    public void ziehen(char richtung, int anzahl){
        switch (richtung){
            case '-':
                ziehen(anzahl, 0);
                break;
            case '|':
                ziehen(0, anzahl);
                break;
            case '\\':
                ziehen(anzahl, -anzahl);
                break;
            case'/':
                ziehen(anzahl,anzahl);
                break;
            default:
                System.out.println("Warnung: Unzulässiges Zeichen");
        }
    }

    /*Methode zur Pruefung ob Jaeger Beute gefangen hat*/
    public boolean trifft(DameFigur andereFigur){
        return super.getxPos() == andereFigur.getxPos() && super.getyPos() == andereFigur.getyPos();
    }

    /**Liefert String Darstellung des Spiel Figur Objekts*/
    public String toString(){
        return super.getFarbe() + "e Dame ist auf Feld X:" + super.getxPos() + " und Feld Y:" + super.getyPos();
    }




}
