package Kapitel8.Aufgabe8_16;

/**
 * Created by Moser Harry on 30.09.2016.
 */
public class TrinkGlas {

    private Glasboden boden;
    private double fuellStand;

    public TrinkGlas(double fuellStand, Glasboden boden) {
        this.fuellStand = fuellStand;
        this.boden = boden;
    }

    public void verkleinern(double x){
           fuellStand = fuellStand - x;
    }

    public double flaeche(){
        return boden.umfang() * fuellStand + boden.flaeche();
    }

    public double fuellMenge(){
        return boden.flaeche()*fuellStand;
    }
    @Override
    public String toString(){
        return "g: Boden radius(" + boden +"," + "S = Fuellstand " + fuellStand + " )";
    }
}
