package Kapitel9.Währung;

/**
 * Created by Moser Harry on 08.10.2016.
 */
public class Sohn extends Vater {

    public int var;

    public Sohn(){
        var = 2;
    }
    public void zeigeVar(){
        System.out.println("Währung.Sohn: " + var);
    }
}
