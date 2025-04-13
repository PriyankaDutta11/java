package main.java.employee.menagement.connection;

import main.java.employee.menagement.module.Employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBOperation {

    ResultSet rs = null;
    public ResultSet getData(Connection con, Statement stmt, String query  ) throws SQLException{
        stmt = con.createStatement();
        rs = stmt.executeQuery(query);
        return rs;
    }

    public void insertData(Connection con, Statement stmt, String query  ) throws SQLException{
        stmt = con.createStatement();
        stmt.executeQuery(query);
    }



}

