package features.login.controller;

import features.login.controller.service.LoginService;
import features.login.controller.view.LoginView;

public class LoginControllerImpl implements LoginController {
    private LoginView view;
    private LoginService service;

    public LoginControllerImpl(LoginView view, LoginService service) {
        this.view = view;
        this.service = service;
    }
    @Override
    public boolean login() {
        boolean result = service.authenticate(view.getUserName(),view.getPassword());
        if (result) {
            view.showSuccess();
        }else{
            view.showError();
        }
        return result;
    }
}
