package Kapitel9.Währung;

/**
 * Created by Moser Harry on 04.10.2016.
 */
public class France extends Euro {

    public static final double kurs = 6.55957;

    public France (double france){
        super (france / kurs);
    }
    public France (Euro euro){
        super (euro.euroBetrag());
    }

    public double waehrungsBetrag(){
        return euroBetrag() * kurs;
    }
}
