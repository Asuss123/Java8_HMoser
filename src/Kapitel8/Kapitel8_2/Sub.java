package Kapitel8.Kapitel8_2;

/**
 * Created by Moser Harry on 25.09.2016.
 */
public class Sub extends Super {

    public String y = "vor Sub-Konstruktor";

    public Sub(){
        System.out.println("Sub-Konstruktor gestartet");
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);
        x = "nach Sub-Konstruktor";
        y = "nach Sub-Konstruktor";
        System.out.println("Sub-Konstruktor beendet");
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);

    }
 }
