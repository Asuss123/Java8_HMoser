package Kapitel9.Aufgabe9_10;

/**
 * Created by Moser Harry on 11.10.2016.
 */
public class KlasseC extends KlasseA {

    KlasseB b;
    KlasseC(int i){
        super(i);
        b = new KlasseB(i);
    }

}
