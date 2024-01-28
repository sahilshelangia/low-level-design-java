package design.patterns.state;

public class Phone {
    private PhoneState phoneState;

    public Phone(PhoneState phoneState) {
        this.phoneState = phoneState;
    }

    public void setPhoneState(PhoneState phoneState) {
        this.phoneState = phoneState;
    }
}
