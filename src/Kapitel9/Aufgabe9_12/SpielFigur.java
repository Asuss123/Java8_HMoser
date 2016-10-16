package Kapitel9.Aufgabe9_12;

/**
 * Created by Moser Harry on 16.10.2016.
 */
public class SpielFigur {

    /**X Koordinaten (A-H) der Position der Figur*/
    private char xPos;


    /**y-Koordinate (1-8) der Position der Figur*/
    private int yPos;


    /**Farbe der Figur*/
    private String farbe;

    /**Konstruktor*/
    public SpielFigur(char x, int y , String f){
        xPos  = x;
        yPos  = y;
        farbe = f;
        /**Korrigiert eventuelle Falsch Position*/
        korrigierePosition();
    }
    /**Korrigiert die Positionsangebe*/
    private void korrigierePosition(){
        if (xPos<'A'){
            xPos= 'A';
        }
        else if (xPos>'H'){
            xPos='H';
        }
        if (yPos<1){
            yPos = 1;
        }
        else if (yPos > 8){
            yPos = 8;
        }
    }
    /**Liefert den Wert der Instanz Variable xPos*/
    public char getxPos() {
        return xPos;
    }
    /**Liefert den Wert der Instanz Variable yPos*/
    public int getyPos() {
        return yPos;
    }
    /**Liefert den Wert der Instanz Variable farbe*/
    public String getFarbe() {
        return farbe;
    }
    /**Bewegt die Spiel Figiur
     * um xF Felder nach rechts (<0 nach links) und
     * um yF Felder nach oben (< 0 nach unten)
     */
    public void ziehen(int xF, int yF){
        xPos = (char) (xPos + xF);
        yPos = yPos + yF;
        //Korrigiert eventuell falsche Positions Angeben
        korrigierePosition();
    }
    /**Liefert String Darstellung des Spiel Figur Objekts*/
    public String toString(){
        return farbe + " e Figur auf Feld " + getxPos()+ getyPos();
    }
}


