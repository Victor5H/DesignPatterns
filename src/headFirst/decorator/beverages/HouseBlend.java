package headFirst.decorator.beverages;

public class HouseBlend extends Beverage{
    private String name = "House Blend";
    public HouseBlend(){
        this.description = this.getSize()+" "+name;
    }

    @Override
    public double cost() {
        return .89;
    }
}
