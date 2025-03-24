import model.Employee;
 import repro.EmployeeRepro;

 public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to my Empoyee System Management");
        final EmployeeRepro employeeRepro = new EmployeeRepro();
    
        employeeRepro.addEmployee();

        for(Employee employee: employeeRepro.getAllEmployees()){
            System.out.println(employee.getEmployeeSalary());
        }
        

        System.out.println(employeeRepro.getSingleEmployee());
        // employeeRepro.deleteSingleEmployee();
        employeeRepro.updateSingleEmployee();

      

        
    }
}