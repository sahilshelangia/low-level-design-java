package design.patterns.command;

public class TV {
    private String state;

    public TV(String state) {
        this.state = state;
    }

    public void turnOn(){
        System.out.println("Turned On");
    }

    public void turnOff(){
        System.out.println("Turned Off");
    }
}
