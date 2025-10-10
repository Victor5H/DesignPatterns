package headFirst.decorator;

import headFirst.decorator.beverages.Beverage;
import headFirst.decorator.beverages.Decaf;
import headFirst.decorator.beverages.Espresso;
import headFirst.decorator.condiments.Mocha;
import headFirst.decorator.condiments.Soy;
import headFirst.decorator.condiments.SteamedMilk;
import headFirst.decorator.condiments.Whip;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.zip.ZipInputStream;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage decaf = new Decaf();
        decaf.setSize(Beverage.Size.VENTI);
        decaf = new Mocha(decaf);
        decaf = new SteamedMilk(decaf);
        decaf = new Whip(decaf);
        System.out.println(decaf.getDescription());
        System.out.println(decaf.cost());

        Beverage espresso =  new Espresso();
        espresso.setSize(Beverage.Size.VENTI);
        espresso = new Mocha(espresso);
        espresso = new Mocha(espresso);
        espresso = new Soy(espresso);
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());

    }
}
