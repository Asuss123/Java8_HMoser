package Kapitel9.InnereKlassen;

/**
 * Created by Moser Harry on 12.10.2016.
 */
public class Aufzaelung {

    //Instanz Variable
    private double[] zahlen;

    /**Konstruktor erzeugt ein Zahlen Feld mit n Feldern*/
    public Aufzaelung(int n){
        zahlen = new double[n];
        for (int i = 0; i < n;i++){
            zahlen[i] = Math.random()* 100;
        }
    }

    /**Methode länge das Array*/
    public int length(){
        return zahlen.length;
    }

    /**Gibt dem Index(i) entsprechend die gespeicherte Zahl zurück*/
    public double getZahl(int i){
        return zahlen[i];
    }

    /**Anonyme Klasse */
    public Folge folge(){
        return new Folge() {

            private int zaehler = 0;

            @Override
            public boolean elementeVerfuegbar() {
                return zaehler < zahlen.length;
            }

            @Override
            public Object naechstesElement() {
                Double res = new Double(zahlen[zaehler]);
                zaehler++;
                return res;
            }
        };
    }

   /* private class Aneinanderreihung implements Folge{

        private int zaehler = 0;

        public boolean elementeVerfuegbar(){
            return zaehler < zahlen.length;
        }
        public Object naechstesElement() {
            Double res = new Double(zahlen[zaehler]);
            zaehler++;
            return res;
        }
   }*/
   /**Main Mothode zum start vom Programm*/
    public static void main(String[] args) {
        Aufzaelung zahlen = new Aufzaelung(10);
        for (Folge f = zahlen.folge(); f.elementeVerfuegbar();) {

            System.out.println(f.naechstesElement());
        }
    }
}

