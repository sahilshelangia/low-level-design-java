package design.patterns.state;

public class OffPhoneState implements PhoneState {
    @Override
    public void pressPowerButton() {
        System.out.println("Now phone is in ON state");
    }
}
