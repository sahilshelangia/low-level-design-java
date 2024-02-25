package design.problems.trafficlight.light;

import java.util.UUID;

public abstract class TrafficLight {
    private String id;
    protected LightState state;

    public TrafficLight(LightState state, String id) {
        this.id = id;
        this.state = state;
    }

    public LightState getState() {
        return this.state;
    }

    public abstract TrafficLight changeState();

    public String getId() {
        return this.id;
    }
}

