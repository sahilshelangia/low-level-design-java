package design.problems.atm;

import java.util.UUID;

public class User {
    private UUID uuid;
    private String name;

    public User(String name) {
        this.uuid = UUID.randomUUID();
        this.name = name;
    }
}
