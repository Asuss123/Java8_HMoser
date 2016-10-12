package Kapitel8.Aufgabe8_9;

/**
 * Created by Moser Harry on 01.10.2016.
 */
public class Mensch {

    private static int gesamtZahl = 0;

    private int nummer;
    private String vorname;
    private String nachname;
    private  int alter;
    private boolean geschlecht;

    public Mensch(int nummer, String vorname, String nachname, int alter, boolean geschlecht) {
        this.nummer = nummer;
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.geschlecht = geschlecht;
        gesamtZahl++;
        nummer = gesamtZahl;
    }

    public int getAlter(){
        return alter;
    }

    public void setAlter(int neuesAlter){
        this.alter = neuesAlter;
    }
    public boolean getIstMaennlich(){
        return geschlecht;
    }

    public String getNachname() {
        return nachname;
    }

    public boolean aelterAls (Mensch m){
        return this.alter > m.alter;
    }

    @Override
    public String toString() {
        String sex = "Weiblich";
        if(geschlecht){
            sex = "Maennlich";
        }
        return "Vorname :\t" + vorname + "\nNachname: \t" + nachname + "\nAlter : \t" + alter + "\nGeschlaecht : \t"  + sex;
    }
}
