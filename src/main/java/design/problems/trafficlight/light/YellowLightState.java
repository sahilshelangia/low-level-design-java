package design.problems.trafficlight.light;

public class YellowLightState extends TrafficLight {
    public YellowLightState(String id) {
        super(LightState.YELLOW, id);
    }

    @Override
    public TrafficLight changeState() {
        System.out.println(String.format("Light id: %s - changing from Yellow to Red", this.getId()));
        return new RedLightState(this.getId());
    }
}
