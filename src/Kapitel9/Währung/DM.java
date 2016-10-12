package Kapitel9.Währung;

/**
 * Created by Moser Harry on 04.10.2016.
 */
public class DM extends Euro {

    public static final double kurs = 1.95583;

    //Konstruktor
    public DM (double dm){
        super (dm / kurs);
    }

    //Konstruktor
    public DM (Euro euro){
        super(euro.euroBetrag());
    }

    //Methode
    public double waehrungsBetrag(){
        return euroBetrag()*kurs;
    }


}
