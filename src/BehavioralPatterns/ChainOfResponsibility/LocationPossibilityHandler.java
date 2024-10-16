package BehavioralPatterns.ChainOfResponsibility;

public class LocationPossibilityHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getLocation().equalsIgnoreCase("Left coast")) {
            System.out.println("Location is servicable.");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("Location is not servicable.");
        }
    }
}
