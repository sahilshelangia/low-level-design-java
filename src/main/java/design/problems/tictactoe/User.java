package design.problems.tictactoe;

import java.util.UUID;

public class User {
    private final UUID uuid;
    private final String name;
    private int wins;

    public User(String name) {
        this.name = name;
        this.uuid = UUID.randomUUID();
        this.wins = 0;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public void incrementWins() {
        this.wins++;
    }
}
