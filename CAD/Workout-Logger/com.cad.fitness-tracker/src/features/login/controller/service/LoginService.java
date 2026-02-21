package features.login.controller.service;

public interface LoginService {
     public static final String userName="admin";
     public static final String passWord="1234";
    public boolean authenticate(String username, String password);
}
