package headFirst.decorator.beverages;

public class Espresso extends Beverage{
    private static String name = "Espresso";
    public Espresso(){
        super(name);
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
