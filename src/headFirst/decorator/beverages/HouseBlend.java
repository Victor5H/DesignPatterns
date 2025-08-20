package headFirst.decorator.beverages;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        this.description = this.getSize()+" House Blend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
