package headFirst.decorator.beverages;

public class Espresso extends Beverage{
    String name = "Espresso";
    public Espresso(){
        this.description = this.getSize()+" "+name;
    }


    @Override
    public double cost() {
        return 1.99;
    }
}
