package design.patterns.state;

public class OnPhoneState implements PhoneState{
    @Override
    public void pressPowerButton() {
        System.out.println("Now phone is in OFF state");
    }
}
