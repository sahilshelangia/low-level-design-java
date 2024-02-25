package design.problems.trafficlight;

import design.problems.trafficlight.light.TrafficLight;

import java.util.List;

public class Signal {
    private String id;
    private List<TrafficLight> trafficLights;
    private int timeInSec;


    public List<TrafficLight> getTrafficLights() {
        return trafficLights;
    }

    public Signal(List<TrafficLight> trafficLights, int timeInSec, String id) {
        this.trafficLights = trafficLights;
        this.timeInSec = timeInSec;
        this.id = id;
    }

    public void setTimeInSec(int timeInSec) {
        this.timeInSec = timeInSec;
    }

    public int getTimeInSec() {
        return timeInSec;
    }

    public String getId() {
        return id;
    }


    public void turnOff() {
        // changing all the lights to yellow
        trafficLights.replaceAll(TrafficLight::changeState);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Couldn't sleep the thread");
        }
        // changing all the lights to red
        trafficLights.replaceAll(TrafficLight::changeState);
    }

    public void turnOn() {
        // changing all lights to green.
        trafficLights.replaceAll(TrafficLight::changeState);
        try {
            Thread.sleep(timeInSec * 1000L);
        } catch (InterruptedException e) {
            System.out.println("Couldn't sleep the thread");
        }
    }
}
