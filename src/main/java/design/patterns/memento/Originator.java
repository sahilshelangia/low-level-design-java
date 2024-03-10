package design.patterns.memento;

public class Originator {
    private String name;
    private String email;

    public Originator(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Memento createMemento() {
        return new Memento(this.name, this.email);
    }

    public void restoreFromMemento(Memento memento) {
        this.name = memento.getName();
        this.email = memento.getEmail();
    }
}
