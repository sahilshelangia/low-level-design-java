package design.problems.trafficlight.light;

public class RedLightState extends TrafficLight {

    public RedLightState(String id) {
        super(LightState.RED, id);
    }

    @Override
    public TrafficLight changeState() {
        System.out.println(String.format("Light id: %s - changing from Red to Green", this.getId()));
       return new GreenLightState(this.getId());
    }
}
