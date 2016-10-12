package Kapitel9.Währung;

/**
 * Created by Moser Harry on 04.10.2016.
 */
public class Lire extends Euro {

    public static final double kurs = 1936.27;

    public Lire (double lire){
        super (lire / kurs);
    }

    public Lire (Euro euro){
        super (euro.euroBetrag());
    }
    public double waehrungsBetrag (){
        return euroBetrag() * kurs;
    }
}
