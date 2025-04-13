package main.java.employee.menagement.services;

import main.java.employee.menagement.connection.DBOperation;
import main.java.employee.menagement.module.Department;
import main.java.employee.menagement.module.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DepartmentService {

    static String query = "Select * from department;";
    static ResultSet rs = null;
    static Statement stmt = null;


    public static List<Department> getDepartmentList(Connection con) throws SQLException {
        List<Department> DeptList = new ArrayList<>();
        DBOperation dbOperation = new DBOperation();
        rs = dbOperation.getData(con, stmt, query);

        while (rs.next()) {
            Department dept = new Department();
            dept.setId(rs.getInt("id"));
            dept.setDepartment_name(rs.getString("Department_name"));
            dept.setDepartment_category(rs.getString("Department_category"));
            dept.setMax_salary((int) rs.getDouble("Max_salary"));
            dept.setMin_salary(rs.getInt("Min_salary"));

            DeptList.add(dept);

        }

        return DeptList;
    }
}

