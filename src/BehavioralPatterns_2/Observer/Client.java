package BehavioralPatterns_2.Observer;

public class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String status) {
        System.out.println(name + " received update: " + status);
    }
}