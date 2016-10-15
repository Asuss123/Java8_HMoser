package Kapitel9.Vererbung.ch.ibw.Interfaces.test;

import Kapitel9.Vererbung.ch.ibw.abstactbase.AbstrakteBase;

/**
 * Created by Moser Harry on 11.10.2016.
 */
public class TestAbstract {
    public static void main(String[] args) {

        KindBase1 kind1 = new KindBase1();
        KindBase2 kind2 = new KindBase2();
        KindBase3 kind3 = new KindBase3();
        KindBase4 kind4 = new KindBase4();


        kind1.print();
        kind2.print();
        kind3.print();
        kind4.print();

        System.out.println();

        AbstrakteBase[] arrayBase = new AbstrakteBase[4];
        arrayBase[0] = kind1;
        arrayBase[1] = kind2;
        arrayBase[2] = kind3;
        arrayBase[3] = kind4;

        for(AbstrakteBase base : arrayBase){
            base.print();
            base.sagHallo();
        }
    }
}
