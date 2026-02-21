import dao.implementation.EmployeeDaoImpl;
import model.Employee;
import service.LoginService;
import dao.EmployeeDao;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDao dao = new EmployeeDaoImpl();
        LoginService login = LoginService.getInstance();

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if(!login.authenticate(username, password)) {
            System.out.println("Invalid username or password");
            return;
        }
        System.out.println("Login Successful");
        int choice;
        do {
            System.out.println("\n === EMPLOYEE MANAGEMENT SYSTEM ===");
            System.out.println("1.Add Employee: ");
            System.out.println("2.View Employee: ");
            System.out.println("3.Search Employee: ");
            System.out.println("4.Update Employee: ");
            System.out.println("5.Delete Employee: ");
            System.out.println("6.Exit ");
            System.out.println("Enter your choice: ");


            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Name: ");
                    String name=sc.nextLine();

                    System.out.println("Enter role: ");
                    String role=sc.nextLine();

                    System.out.println("Enter Salary: ");
                    double salary=sc.nextDouble();
                    dao.addEmployee(new Employee(id,name,role,salary));
                    break;
                 case 2:
                     dao.viewEmployee();
                     break;
                 case 3:
                     System.out.print("Enter ID: ");
                     int searchId=sc.nextInt();
                     Employee e = dao.searchEmployee(searchId);
                     if(e !=null){
                         System.out.print("Found" +e.getName());
                     }else {
                         System.out.println("Employee not found");
                     }
                     break;

                case 4:
                    System.out.print("Enter ID: ");
                    int updateId=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter New Name: ");
                    String newName=sc.nextLine();
                    System.out.println("Enter New Salary: ");
                    double salaryNew=sc.nextDouble();
                    dao.updateEmployee(updateId,newName,salaryNew);
                    break;

                case 5:
                    System.out.print("Enter ID: ");
                    int deleteId=sc.nextInt();
                    dao.deleteEmployee(deleteId);
                    break;

                case 6:
                    System.out.print("Existing Thank you... ");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
          while(choice!=6);
          sc.close();
    }
}