package headFirst.decorator.condiments;

import headFirst.decorator.beverages.Beverage;

public class SteamedMilk extends CondimentDecorator{
    public SteamedMilk(Beverage beverage){
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" with Steamed Milk";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.10;
    }
}
