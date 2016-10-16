package Kapitel9.Michaele;

/**
 * Created by Moser Harry on 15.10.2016.
 */
public class Buchhaltung {

    public static double preis;

    public static void main(String[] args) {
        InterfacePizza[] pizzas = new InterfacePizza[2];
        pizzas[0] = new PizzaMargaritha("gross" );
        pizzas[1] = new PizzaNapolitana();

        for (int i = 0; i < pizzas.length;i++){
            preis = preis+pizzas[i].getPreis();
        }
        System.out.println("Beide Pizzas kosten :" + preis);

    }
}
