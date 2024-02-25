package design.problems.trafficlight;

import design.problems.trafficlight.light.TrafficLight;

import java.util.*;

public class SignalController {
    private Deque<Signal> signals;

    public SignalController() {
        signals = new ArrayDeque<>();
    }

    public void addSignal(Signal signal) {
        signals.add(signal);
    }

    public void start() {
        Signal prevSignal = null;
        int turns=5;
        while (turns!=0) {
            turns--;

            Signal newSignal = signals.removeFirst();
            if (prevSignal != null) {
                prevSignal.turnOff();
            }
            newSignal.turnOn();
            prevSignal = newSignal;
            signals.add(newSignal);
        }
    }
}
