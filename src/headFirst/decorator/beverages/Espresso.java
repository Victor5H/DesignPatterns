package headFirst.decorator.beverages;

public class Espresso extends Beverage{
    String name = "Espresso";
    public Espresso(){
        this.description = this.getDescription()+" "+name;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
