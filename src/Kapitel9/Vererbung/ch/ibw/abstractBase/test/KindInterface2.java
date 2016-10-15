package Kapitel9.Vererbung.ch.ibw.abstractBase.test;

import Kapitel9.Vererbung.ch.ibw.Interfaces.Interfacebase;

/**
 * Created by Moser Harry on 11.10.2016.
 */
public class KindInterface2 implements Interfacebase {

    public  void myHallo (){
        System.out.println("Hello World");
    }

    @Override
    public void print() {
        System.out.println("Kind2 interface");
    }
}
