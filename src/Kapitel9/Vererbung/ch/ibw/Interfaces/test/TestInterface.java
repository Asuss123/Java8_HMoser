package Kapitel9.Vererbung.ch.ibw.Interfaces.test;

import ch.ibw.Interfaces.Interfacebase;
import ch.ibw.abstractBase.test.KindInterface1;
import ch.ibw.abstractBase.test.KindInterface2;
import ch.ibw.abstractBase.test.KindInterface3;

/**
 * Created by Moser Harry on 11.10.2016.
 */
public class TestInterface {

    public static void printAlleKinder (Interfacebase[] alleEinbinden){
        if (alleEinbinden != null){
            for (Interfacebase kinder : alleEinbinden) {
                kinder.print();
            }
        }
    }

    public static void printkind (Interfacebase k){
        if (k != null);
        k.print();
    }

    public static void main(String[] args) {
        KindInterface1 kind1 = new KindInterface1();
        KindInterface2 kind2 = new KindInterface2();
        KindInterface3 kind3 = new KindInterface3();

        Interfacebase[] kinder = new Interfacebase[3];

        kinder[0] = kind1;
        kinder[1] = kind2;
        kinder[2] = kind3;


        printAlleKinder(kinder);
        printkind(kind1);

        //anonüm Methode
        printkind(new Interfacebase() {
            @Override
            public void print() {
                System.out.println("Hallo Anonym");
            }
        });


    }
}
