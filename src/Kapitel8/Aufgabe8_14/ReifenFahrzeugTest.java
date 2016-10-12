package Kapitel8.Aufgabe8_14;

/**
 * Created by Moser Harry on 02.10.2016.
 */
public class ReifenFahrzeugTest {

    public static void main(String[] args) {

        Fahrzeug fahrrad1 = new Fahrzeug("Fahrrad1", 2, 4.5);
        Fahrzeug auto1 = new Fahrzeug("Auto1",4 ,1.9);

        System.out.println("Zustand 1:");
        fahrrad1.fahreLos();
        fahrrad1.status();
        auto1.halteAn();
        auto1.status();

        System.out.println("Zustand 2:");
        fahrrad1.status();
        auto1.fahreLos();
        auto1.status();

        System.out.println("Zustand 3:");
        fahrrad1.halteAn();
        fahrrad1.status();
        auto1.status();

        System.out.println("Zustand 4:");
        fahrrad1.status();
        auto1.halteAn();
        auto1.status();


    }

}
