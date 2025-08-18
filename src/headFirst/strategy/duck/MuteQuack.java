package headFirst.strategy.duck;

import headFirst.strategy.behaviour.quack.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<silence>");
    }
}
