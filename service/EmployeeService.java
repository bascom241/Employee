package service;

import java.util.ArrayList;
import java.util.List;
import model.Employee;

public class EmployeeService {
    private Employee employees = new Employee();
    private Employee updatedEmployees = new Employee();

    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeService() {
        // Set the employee Details
        employees.setEmployeeId(1);
        employees.setEmployeeName("Abdulbasit");
        employees.setEmployeeSalary(50);

        employeeList.add(employees);

    }

    // get All Employees //
    public List<Employee> getAllEmployee() {
        return employeeList;
    }

    // Add An Employee /
    public void addEmployee() {
        updatedEmployees.setEmployeeId(2);
        updatedEmployees.setEmployeeName("AbdulQudus");
        updatedEmployees.setEmployeeSalary(40);
        employeeList.add(updatedEmployees);
        System.out.println("Employees Added");
    }

    // Get a single Employee //
    public Employee getSingleEmployee(int value) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeId() == value) {
                return employee;
            }
        }
        return null;
    }

    // delete a Single Employee //
    public void deleteSingleEmployee(int index) {

        Employee employeeToRemove = null;
        for (Employee employee : employeeList) {
            if (employee.getEmployeeId() == index) {
                employeeToRemove = employee;
                break;
            } else {
                System.out.println("Not Found");
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
            System.out.println("Employee with id " + employeeToRemove + "has been deleted");
        } else {
            System.out.println("Employee with id " + employeeToRemove + "Failed to remove");
        }

    }

    public Employee updateSingleEmployee(int index) {
        Employee employeeToUpdate = null;

        for (Employee employee : employeeList) {
            if (employee.getEmployeeId() == index) {
                employeeToUpdate = employee;
                break;
            } else {
                System.out.println("Not Found");
            }
        }

        if (employeeToUpdate != null) {
            updatedEmployees.setEmployeeName("Yussuf");
            employeeList.set(index,updatedEmployees );
        }
        return employeeToUpdate;
    }

}
