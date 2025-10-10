package headFirst.decorator.beverages;

public class Decaf extends Beverage{
    private String name = "Decaf";
    public Decaf(){
        this.description = this.getSize()+" "+name;
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
