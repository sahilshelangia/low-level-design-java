package design.patterns.strategy;

import design.patterns.strategy.fly.FlyBehaviour;
import design.patterns.strategy.fly.FlyWithWings;
import design.patterns.strategy.quack.MuteQuack;
import design.patterns.strategy.quack.QuackBehaviour;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new FlyWithWings(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Red head duck");
    }
}
