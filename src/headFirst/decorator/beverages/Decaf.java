package headFirst.decorator.beverages;

public class Decaf extends Beverage{
    private static String name = "Decaf";
    public Decaf(){
        super(name);
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
