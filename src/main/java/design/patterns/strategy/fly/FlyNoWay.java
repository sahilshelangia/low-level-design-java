package design.patterns.strategy.fly;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Can't fly !");
    }
}
