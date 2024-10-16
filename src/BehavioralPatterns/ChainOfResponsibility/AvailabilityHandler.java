package BehavioralPatterns.ChainOfResponsibility;

public class AvailabilityHandler extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.isCarAvailable()) {
            System.out.println("Car is available.");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("No cars available.");
        }
    }
}
