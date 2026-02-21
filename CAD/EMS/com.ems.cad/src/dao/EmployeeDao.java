package dao;

import model.Employee;

public interface EmployeeDao {
    public void addEmployee(Employee emp);
    public void viewEmployee();
    public Employee searchEmployee(int empId);
    public void updateEmployee(int empId,String name,double salary);
    public void deleteEmployee(int empId);


}
