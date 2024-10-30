package BehavioralPatterns_2.Observer;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        Client client1 = new Client("Client 1");
        Client client2 = new Client("Client 2");

        order.subscribe(client1);
        order.subscribe(client2);

        order.setStatus("Confirmed");
        order.setStatus("On the way");

        order.unsubscribe(client1);

        order.setStatus("Completed");
    }
}
