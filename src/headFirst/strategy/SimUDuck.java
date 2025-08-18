package headFirst.strategy;

import headFirst.strategy.behaviour.fly.FlyRocketPowered;
import headFirst.strategy.duck.Duck;
import headFirst.strategy.duck.MallardDuck;
import headFirst.strategy.duck.ModelDuck;

public class SimUDuck{
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.display();
        modelDuck.performFly();
    }
}
