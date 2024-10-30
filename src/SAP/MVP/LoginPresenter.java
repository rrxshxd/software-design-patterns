package SAP.MVP;

public class LoginPresenter {
    private LoginView view;
    private User user;

    public LoginPresenter(LoginView view) {
        this.view = view;
    }

    public void login(String username, String password) {
        user = new User(username, password);
        if (user.isValid()) {
            view.showLoginSuccess("Login successful!");
        } else {
            view.showLoginError("Invalid username or password!");
        }
    }
}
