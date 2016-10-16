package Kapitel9.Michaele;

/**
 * Created by Moser Harry on 15.10.2016.
 */
public class PizzaMargaritha extends Pizza implements InterfacePizza{

    private String[] zutaten;
    private double preis;
    private String groesse;

    public PizzaMargaritha(String groesse) {
        zutaten = new String[3];
        zutaten[0] = "Kaese";
        zutaten[1] = "Tomatensose";
        zutaten[2] = "Oregano";
        preis = 23;
        this.groesse = groesse;
        kalkulierePreis();
    }

    private void kalkulierePreis() {
        if(groesse.equals("klein")) {
            preis = preis;
        }
        else if (groesse.equals("mittel")){
            preis = preis + 3;
        }
        else if (groesse.equals("gross")) {
            preis = preis +6;
        }
        else {
            System.out.println("Falsche Eingabe");
            preis =99;
        }
    }

    public String getGroesse() {
        return groesse;
    }



   /* @Override
    public String[] getZutaten() {
        return zutaten;
    }

    @Override
    public double getPreis() {
        return preis;
    }*/
}
