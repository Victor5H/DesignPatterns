package headFirst.decorator.condiments;

import headFirst.decorator.beverages.Beverage;

public class Sugar extends CondimentDecorator{
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" with Sugar";
    }

    @Override
    public double cost() {
        return 0.13+ beverage.cost();
    }
}
