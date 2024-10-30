package BehavioralPatterns_2.Template;

public class Main {
    public static void main(String[] args) {
        OrderProcess standardProcess = new StandardOrderProcess();

        standardProcess.processOrder();
    }
}
