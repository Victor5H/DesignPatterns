package headFirst.decorator.condiments;

import headFirst.decorator.beverages.Beverage;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" with Soy";
    }

    @Override
    public double cost() {
        switch (beverage.getSize()){

            case TALL -> {
                return beverage.cost()+0.10;
            }
            case VENTI -> {
                return beverage.cost()+0.20;
            }
            case GRANDE -> {
                return beverage.cost()+0.15;
            }
        }
        return 0;
    }
}
