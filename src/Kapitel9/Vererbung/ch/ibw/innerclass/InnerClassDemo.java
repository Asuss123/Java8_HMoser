package Kapitel9.Vererbung.ch.ibw.innerclass;

/**
 * Created by Moser Harry on 11.10.2016.
 */
public class InnerClassDemo {

    private String name;
    private String vorname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    @Override
    public String toString(){
        PrintData p = new PrintData();
        return p.print();
    }

    public class PrintData{

        public String print(){
           return vorname +  "" + name;
        }
    }
}
