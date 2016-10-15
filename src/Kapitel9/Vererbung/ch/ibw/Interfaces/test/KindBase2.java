package Kapitel9.Vererbung.ch.ibw.Interfaces.test;

import Kapitel9.Vererbung.ch.ibw.abstactbase.AbstrakteBase;

/**
 * Created by Moser Harry on 11.10.2016.
 */
public class KindBase2 extends AbstrakteBase {


    @Override
    public void sagHallo() {
       System.out.println("Hallo Harry");
    }

    @Override
    public void print() {
        System.out.println("Kind2");
    }
}
