package design.patterns.state;

public class Main {
    public static void main(String[] args) {
        PhoneState phoneState = new OnPhoneState();
        phoneState.pressPowerButton();
    }
}
