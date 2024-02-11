package design.patterns.strategy;

import design.patterns.strategy.fly.FlyWithWings;
import design.patterns.strategy.quack.MuteQuack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super(new FlyWithWings(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("Mallard duck");
    }
}
