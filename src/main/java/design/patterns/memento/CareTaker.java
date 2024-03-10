package design.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> history;

    public CareTaker() {
        this.history = new ArrayList<>();
    }

    public void add(Memento memento){
        this.history.add(memento);
    }

    public Memento get(int index){
       return this.history.get(index);
    }
}
