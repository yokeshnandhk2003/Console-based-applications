package features.login.controller.service;

public class LoginServiceImpl implements LoginService {
    public boolean authenticate(String username,String password){
        return userName.equals(username) && passWord.equals(password);
    }

}
