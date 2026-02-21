package dao.implementation;
import dao.EmployeeDao;
import model.Employee;

import java.util.ArrayList;

public class EmployeeDaoImpl implements EmployeeDao {

    private ArrayList<Employee> employees=new ArrayList<>();
    public void addEmployee(Employee emp){
       employees.add(emp);
    }

    @Override
    public void viewEmployee() {
     if(employees.isEmpty()){
         System.out.println("No employees found");
         return;
     }
     System.out.println("\nID Name Role Salary ");
     for(Employee e:employees){
         System.out.println(
                 e.getEmpId()+" "+
                 e.getName()+" "+
                 e.getRole()+" "+
                 e.getSalary());
     }
    }

    @Override
    public Employee searchEmployee(int empId) {
    for(Employee e:employees){
        if(e.getEmpId()==empId){
            return e;
        }
    }
      return null;
    }

    @Override
    public void updateEmployee(int empId, String name, double salary) {
        Employee e= searchEmployee(empId);
        if(e!=null){
            e.setName(name);
            e.setSalary(salary);
            System.out.println("Updated employee  "+e.getEmpId()+" Successfully");
        }


    }

    @Override
    public void deleteEmployee(int empId) {
     Employee e= searchEmployee(empId);
     if(e!=null){
         employees.remove(e);
         System.out.println("Deleted employee  "+e.getEmpId()+" Successfully");
     }
     else{
         System.out.println("Employee "+empId+" not found");
     }
    }
}
