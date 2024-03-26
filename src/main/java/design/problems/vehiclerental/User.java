package design.problems.vehiclerental;

import java.util.UUID;

public class User {
    private UUID uuid;
    private String name;
    private String email;
    private String phoneNumber;

    public User(String name, String email, String phoneNumber) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
