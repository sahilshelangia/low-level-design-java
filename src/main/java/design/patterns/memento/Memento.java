package design.patterns.memento;

public class Memento {
    private String name;
    private String email;

    public Memento(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
