package main.java.employee.menagement.services;

import main.java.employee.menagement.connection.DBOperation;
import main.java.employee.menagement.module.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    String query = "Select * from employee;";
    ResultSet rs = null;
    Statement stmt = null;


    public List<Employee> getEmployeelist(Connection con) throws SQLException {
        List<Employee> empList = new ArrayList<>();
        DBOperation dbOperation = new DBOperation();
        rs = dbOperation.getData(con, stmt,query);

        while (rs.next()) {
            Employee emp = new Employee();
            emp.setId(rs.getInt("id"));
            emp.setName(rs.getString("name"));
            emp.setJob_title(rs.getString("job_title"));
            emp.setSalary(rs.getDouble("salary"));
            emp.setDepartment(rs.getInt("department"));

            empList.add(emp);

        }

        return empList;
    }

    public String addNewEmployee(Employee employee, Connection connection) throws SQLException {
        String query = "INSERT INTO EMPLOYEE (id, name, job_title, salary, department) values("
                +employee.getId()
                +","
                +employee.getName()
                +","
                +employee.getJob_title()
                +","
                +employee.getSalary()
                +","
                +employee.getDepartment()+");";
        DBOperation dbOperation = new DBOperation();
        dbOperation.insertData(connection, stmt,query);

        return "Data Inserted Successfully ! ";
    }



//    public List<Employee> getEmployeelist1(Connection con) throws SQLException {
//        List<Employee> empList = new ArrayList<>();
//
//
//        stmt = con.createStatement();
//        rs = stmt.executeQuery(query);
//        while (rs.next()) {
////                Employee emp = new Employee(rs.getInt("id"),
////                        rs.getString("name"),
////                        rs.getString("job_title"),
////                        rs.getDouble("salary"));
//
//            Employee emp1 = new Employee();
//
//            emp1.setId(rs.getInt("id"));
//            emp1.setName(rs.getString("name"));
//            emp1.setJob_title(rs.getString("job_title"));
//            emp1.setSalary(rs.getDouble("salary"));
//            emp1.setDepartment(rs.getInt("department"));
//
//
////            int id = rs.getInt("id");
////            String name=rs.getString("name");
////            String job_title=rs.getString("job_title");
////            double salary = rs.getDouble("salary");
////            System.out.println("************");
////            System.out.println("ID:"+id);
////            System.out.println("Name :"+name);
////            System.out.println("job_title :"+job_title);
////            System.out.println("Salary:"+salary);
//            empList.add(emp1);
//
//        }
//
//        return empList;
//    }
}
