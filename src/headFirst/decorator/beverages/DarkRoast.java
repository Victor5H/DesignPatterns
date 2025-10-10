package headFirst.decorator.beverages;

public class DarkRoast extends Beverage{
    private String name= "Dark Roast";
    public DarkRoast(){
        this.description = this.getSize()+" "+name;
    }

    @Override
    public double cost() {
        return .99;
    }
}
