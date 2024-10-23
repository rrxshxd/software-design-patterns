package BehavioralPatterns_2.Observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Observer> clients = new ArrayList<>();
    private String status;

    public void subscribe(Observer client) {
        clients.add(client);
    }

    public void unsubscribe(Observer client) {
        clients.remove(client);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyClients();
    }

    private void notifyClients() {
        for (Observer client : clients) {
            client.update(status);
        }
    }
}
