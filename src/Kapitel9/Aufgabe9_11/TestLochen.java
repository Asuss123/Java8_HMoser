package Kapitel9.Aufgabe9_11;

import Prog1Tools.IOTools;

/**
 * Created by Moser Harry on 11.10.2016.
 */
public class TestLochen {



    public static GelochtePlatte lochen(MetallPlatte mp){
            GelochtePlatte gp = new GelochtePlatte(mp.laenge, mp.breite, 10);
            int n = IOTools.readInt("Bitte Anzahl der zu Stanzenden Loechwer eingeben");
            for (int i = 1; i<=n;i++){
                gp.neuesLochStanzen();

            }
        return gp;
    }

    public static void main(String[] args) {
        double laenge = IOTools.readDouble("Bitte länge vom Blech1 eingeben: ");
        double breite = IOTools.readDouble("Bitte breite vom Blech1 eingeben: ");
        MetallPlatte mp1 = new MetallPlatte(laenge,breite);


        laenge = IOTools.readDouble("Bitte länge vom Blech2 eingeben: ");
        breite = IOTools.readDouble("Bitte breite vom Blech2 eingeben: ");
        MetallPlatte mp2 = new MetallPlatte(laenge,breite);

        if (mp1.schwererAls(mp2)){
            System.out.println("Blech1 ist schwerer als Blech2");
        }
        else if (mp2.schwererAls(mp1)){
            System.out.println("Blech2 ist schwerer als Blech1");
        }
        else{
            System.out.println("Beide Bleche sind gleich schwer");
        }



    }

}
