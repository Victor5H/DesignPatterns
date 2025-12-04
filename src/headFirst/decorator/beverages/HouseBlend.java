package headFirst.decorator.beverages;

public class HouseBlend extends Beverage{
    private static String name = "House Blend";
    public HouseBlend(){
        super(name);
    }

    @Override
    public double cost() {
        return .89;
    }
}
