package headFirst.strategy.duck;

import headFirst.strategy.behaviour.fly.FlyNoWay;

public class RubberDuck extends Duck{
    public  RubberDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a model Duck");
    }
}
