package design.problems.trafficlight.light;

import design.trafficlight.light.Direction;

public class GreenLightState extends TrafficLight {
    public GreenLightState(String id) {
        super(LightState.GREEN, id);
    }

    @Override
    public TrafficLight changeState() {
        System.out.println(String.format("Light id: %s - changing from Green to Yellow", this.getId()));
        return new YellowLightState(this.getId());
    }
}
