package controller;
import service.AuthService;
public class AuthController {
    private AuthService service = new AuthService();

    public void login(String username, String password) {
        service.login(username, password);
    }
}
