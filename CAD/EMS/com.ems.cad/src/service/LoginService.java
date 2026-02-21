package service;

public class LoginService {

    private static LoginService instance;
    private final String USERNAME = "admin";
    private final String PASSWORD = "1234";

    private LoginService(){}
//Singleton pattern
    public static LoginService getInstance(){
        if(instance==null){
            instance=new LoginService();
        }
        return instance;
    }

    public  boolean authenticate(String username,String password){
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }

}
