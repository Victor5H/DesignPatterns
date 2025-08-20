package headFirst.decorator.condiments;

import headFirst.decorator.beverages.Beverage;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" with Whipped Cream";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.10;
    }
}
