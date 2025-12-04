package headFirst.decorator.condiments;

import headFirst.decorator.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected final Beverage beverage;
    CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
        this.setSize(beverage.getSize());
    }
    public abstract String getDescription();
    public abstract double cost();
}
