package SAP.MVP;

public class ConsoleLoginView implements LoginView {
    private LoginPresenter presenter;

    public ConsoleLoginView() {
        presenter = new LoginPresenter(this);
    }

    public void displayLogin(String username, String password) {
        presenter.login(username, password);
    }


    @Override
    public void showLoginSuccess(String message) {
        System.out.println(message);
    }

    @Override
    public void showLoginError(String error) {
        System.out.println(error);
    }
}
