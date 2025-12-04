package headFirst.decorator.beverages;

public class DarkRoast extends Beverage{
    private static final String name ="Dark Roast";
    public DarkRoast(){
        super(name);
    }

    @Override
    public double cost() {
        return .99;
    }
}
