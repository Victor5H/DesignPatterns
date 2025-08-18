package headFirst.strategy.duck;

import headFirst.strategy.behaviour.fly.FlyBehaviour;
import headFirst.strategy.behaviour.quack.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }
    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }
    public void performQuack(){
        quackBehaviour.quack();
    }
    public void performFly(){
        flyBehaviour.fly();
    }
    public void swim(){
        System.out.println("I am swimming");
    }
    public void display(){
        System.out.println("I am being displayed");
    }
}
