package design.patterns.strategy;

public class Main {
    public static void main(String[] args) {
        Duck readHeadDuck = new RedHeadDuck();
        readHeadDuck.fly();
    }
}
