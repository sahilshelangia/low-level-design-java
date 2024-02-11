package design.patterns.strategy;

import design.patterns.strategy.fly.FlyBehaviour;
import design.patterns.strategy.fly.FlyNoWay;
import design.patterns.strategy.quack.QuackBehaviour;
import design.patterns.strategy.quack.Squeak;

public class DecoyDuck extends Duck{
    public DecoyDuck() {
        super(new FlyNoWay(), new Squeak());
    }

    @Override
    public void display() {

    }
}
