package BehavioralPatterns.ChainOfResponsibility;

public class BalanceVerificationHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getClientBalance() > 700.0) {
            System.out.println("Your balance is enough to take a minimum ride.");
            if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
