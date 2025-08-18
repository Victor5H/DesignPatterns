package headFirst.strategy.duck;

import headFirst.strategy.behaviour.fly.FlyWithWings;
import headFirst.strategy.behaviour.quack.Quack;

public class MallardDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
    }
    public MallardDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
}
