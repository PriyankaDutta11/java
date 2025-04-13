import java.sql.SQLOutput;

public class Employee {
    void work(){
        System.out.println("Employee works");
    }
    private int salary;
    Employee(int salary){
        this.salary=salary;
    }
    int getSalary(){
         return salary;
    }
}
class Employee_management{
    public static void main(String[] args) {
        Employee employee = new Employee(40000);
        HRManager hr= new HRManager(70000);
        employee.work();
        System.out.println("The salary is: " + employee.getSalary());

        hr.work();
        hr.addEmployee();
        System.out.println("The salary of the HR: "+hr.getSalary());

    }

}
