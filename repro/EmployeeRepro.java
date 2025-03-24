package repro;

import java.util.List;

import model.Employee;
import service.EmployeeService;

public class EmployeeRepro {

    private EmployeeService employeeService = new EmployeeService();


    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }

    public void addEmployee(){
        employeeService.addEmployee();
    }
    
    public Employee getSingleEmployee(){
       return employeeService.getSingleEmployee(1);
    }
    public void deleteSingleEmployee(){
        employeeService.deleteSingleEmployee(1);
    }
    public Employee updateSingleEmployee(){
        return employeeService.updateSingleEmployee(1);
    }
}
