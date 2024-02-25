package design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<IObserver> IObservers;

    public Subject() {
        this.IObservers = new ArrayList<>();
    }

    public void addObserver(IObserver IObserver){
        this.IObservers.add(IObserver);
    }
    public void removeObserver(IObserver IObserver){
        this.IObservers.remove(IObserver);
    }
    public void notifyObservers(){
        for(IObserver IObserver : IObservers){
            IObserver.update();
        }
    }
}
