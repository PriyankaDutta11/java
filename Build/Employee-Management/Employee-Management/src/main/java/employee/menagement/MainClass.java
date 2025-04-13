package main.java.employee.menagement;

import main.java.employee.menagement.connection.DBConnection;
import main.java.employee.menagement.connection.DBOperation;
import main.java.employee.menagement.module.Department;
import main.java.employee.menagement.module.Employee;
import main.java.employee.menagement.module.EmployeeDetails;
import main.java.employee.menagement.services.DepartmentService;
import main.java.employee.menagement.services.EmployeeDetailsService;
import main.java.employee.menagement.services.EmployeeService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) throws SQLException {

        /* ===================== Employee Object sating and Insertion into Employee Table ===================*/

        /* ===================== Take all the Employee related data from User ===================*/

        /* ===================== Map those inputs into Employee Object ===================*/

//            Employee employee = new Employee();
//
//            employee.setName(sc.name);
//            employee.setSalary(sc.salary);


        /* =============================================== End ==============================================*/

        DBConnection dbConnection = new DBConnection();
        EmployeeService employeeService = new EmployeeService();
        EmployeeDetailsService employeeDetailsService = new EmployeeDetailsService();
        DepartmentService departmentService=new DepartmentService();

        List<Employee> employeeList = new ArrayList<>();
        List<EmployeeDetails> employeeDetailsList = new ArrayList<>();
        List<Department> departmentList=new ArrayList<>();


        Connection connection = dbConnection.getConnection();

        employeeList = employeeService.getEmployeelist(connection);


        employeeDetailsList = employeeDetailsService.getEmployeeDetailList(connection);

        departmentList = departmentService.getDepartmentList(connection);

        //Call employeeService.addNewEmployee and show the Success Message



        // Call DepartmentDetailService and get data.....

        System.out.println(":::::::::::::: employeeList :::::::::: " + employeeList);
        System.out.println(":::::::::::::: employeeDetailsList :::::::::: " + employeeDetailsList);
        System.out.println(":::::::::::::: departmentList :::::::::"+departmentList);
        // Print DepartmentList

         dbConnection.closeConnection(connection);

    }
}
