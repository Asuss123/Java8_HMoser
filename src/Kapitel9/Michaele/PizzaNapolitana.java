package Kapitel9.Michaele;

/**
 * Created by Moser Harry on 15.10.2016.
 */
public class PizzaNapolitana extends Pizza implements InterfacePizza{

    private String[] zutaten;
    private double preis;

    public PizzaNapolitana() {
        zutaten = new String[3];
        zutaten[0] = "Kaese";
        zutaten[1] = "Tomatensose";
        zutaten[2] = "Oregano";
        preis = 23;


    }

    @Override
    public String[] getZutaten() {
        return zutaten;
    }

    @Override
    public double getPreis() {
        return preis;
    }
}
