package design.patterns.memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator("sahil", "sahil@gmail.com");
        CareTaker careTaker = new CareTaker();

        // let's add first snapshot
        careTaker.add(originator.createMemento());


        // update originator
        originator.setName("Deepak");
        careTaker.add(originator.createMemento());

        originator.restoreFromMemento(careTaker.get(0));
        System.out.println(originator.getName());
    }
}
