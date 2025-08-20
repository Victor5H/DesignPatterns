package headFirst.decorator.condiments;

import headFirst.decorator.beverages.Beverage;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" with Mocha";
    }

    @Override
    public double cost() {
        return 0.20+ beverage.cost();
    }
}
