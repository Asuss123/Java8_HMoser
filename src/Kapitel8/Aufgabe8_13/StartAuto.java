package Kapitel8.Aufgabe8_13;

/**
 * Created by Moser Harry on 30.09.2016.
 */
public class StartAuto {
        public static void main(String[] args){
            Reifen rund = new Reifen(4.36);

            Fahrzeug auto = new Fahrzeug("Toyota", 4);

            auto.fahreLos();

            System.out.println(auto.status()+ rund.getDruck()+ "bar.");

            auto.halteAn();

            System.out.println(auto.status()+ rund.getDruck()+ "bar.");
        }


}
