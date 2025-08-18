package headFirst.strategy.duck;

import headFirst.strategy.behaviour.fly.FlyNoWay;

public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I am a model Duck");
    }
    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }
}
