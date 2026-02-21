package features.login.controller.view;

public interface LoginView {
    String getUserName();
    String getPassword();
    void showSuccess();
    void showError();
}
