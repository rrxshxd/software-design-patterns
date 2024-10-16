package BehavioralPatterns.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Request request = new Request(true, 800.0,"Left coast");

        Handler availabilityHandler = new AvailabilityHandler();
        Handler balanceVerificationHandler = new BalanceVerificationHandler();
        Handler locationPossibilityHandler = new LocationPossibilityHandler();

        availabilityHandler.setNextHandler(balanceVerificationHandler);
        balanceVerificationHandler.setNextHandler(locationPossibilityHandler);

        availabilityHandler.handleRequest(request);
    }
}
