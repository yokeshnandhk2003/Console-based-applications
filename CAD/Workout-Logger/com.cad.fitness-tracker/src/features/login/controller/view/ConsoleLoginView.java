package features.login.controller.view;

import java.util.Scanner;
public class ConsoleLoginView implements LoginView {
    private Scanner sc = new Scanner(System.in);

    public String getUserName(){
        System.out.print("Enter user name: ");
        return sc.nextLine();
    }
    public String getPassword(){
        System.out.print("Enter password: ");
        return sc.nextLine();
    }
    public void showSuccess(){
        System.out.println("Login Successful");
    }
    public void showError(){
        System.out.println("Login Failed");
    }

}
