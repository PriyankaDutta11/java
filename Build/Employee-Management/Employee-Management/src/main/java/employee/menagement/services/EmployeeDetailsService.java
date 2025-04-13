package main.java.employee.menagement.services;

import main.java.employee.menagement.connection.DBOperation;
import main.java.employee.menagement.module.Employee;
import main.java.employee.menagement.module.EmployeeDetails;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDetailsService {

    String query = "Select * from employeedetails;";
    ResultSet rs = null;
    Statement stmt = null;

    public List<EmployeeDetails> getEmployeeDetailList(Connection con) throws SQLException {
        List<EmployeeDetails> empDetailList = new ArrayList<>();
        DBOperation dbOperation = new DBOperation();
        rs = dbOperation.getData(con, stmt,query);
        while (rs.next()) {
            EmployeeDetails emp = new EmployeeDetails();
            emp.setId(rs.getInt("id"));
            emp.setUid(rs.getInt("uid"));
            emp.setAddress(rs.getString("address"));
            emp.setCity(rs.getString("city"));
            emp.setPin(rs.getInt("pin"));
            emp.setEmail(rs.getString("email"));

            empDetailList.add(emp);

        }

        return empDetailList;
    }
}
