package design.problems.trafficlight;

import design.problems.trafficlight.light.GreenLightState;
import design.problems.trafficlight.light.RedLightState;
import design.problems.trafficlight.light.TrafficLight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight1 = new RedLightState("1");
        TrafficLight trafficLight2 = new RedLightState("2");
        TrafficLight trafficLight3 = new RedLightState("3");
        TrafficLight trafficLight4 = new RedLightState("4");
        TrafficLight trafficLight5 = new RedLightState("5");
        TrafficLight trafficLight6 = new RedLightState("6");
        TrafficLight trafficLight7 = new RedLightState("7");
        TrafficLight trafficLight8 = new RedLightState("8");
        TrafficLight trafficLight9 = new RedLightState("9");
        TrafficLight trafficLight10 = new RedLightState("10");
        TrafficLight trafficLight11 = new RedLightState("11");
        TrafficLight trafficLight12 = new RedLightState("12");

        SignalController signalController = new SignalController();
        signalController.addSignal(new Signal(new ArrayList<>(List.of(trafficLight1, trafficLight2, trafficLight3)), 10, "1"));
        signalController.addSignal(new Signal(new ArrayList<>(List.of(trafficLight4, trafficLight5, trafficLight6)), 10, "2"));
        signalController.addSignal(new Signal(new ArrayList<>(List.of(trafficLight7, trafficLight8, trafficLight9)), 10, "3"));
        signalController.addSignal(new Signal(new ArrayList<>(List.of(trafficLight10, trafficLight11, trafficLight12)), 10, "4"));

        signalController.start();
    }
}
