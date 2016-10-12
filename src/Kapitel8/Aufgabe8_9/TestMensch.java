package Kapitel8.Aufgabe8_9;

/**
 * Created by Moser Harry on 01.10.2016.
 */
public class TestMensch {
    public static void main(String[] args) {

        Mensch harry = new Mensch(1,"Harry","Moser",21,true);

        Mensch susi =new Mensch(2,"Susi","Sorglos",22,false);

        if (harry.aelterAls(susi)){
            System.out.println(harry.getNachname()+ " ist aelter als " + susi.getNachname());
        }
        else {
            System.out.println(susi.getNachname() + " ist aelter als " + harry.getNachname());
        }

        System.out.println(harry);


    }

}
