package headFirst.decorator.beverages;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        this.description = this.getSize()+" Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
