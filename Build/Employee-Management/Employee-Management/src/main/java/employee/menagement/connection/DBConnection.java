package main.java.employee.menagement.connection;

import main.java.employee.menagement.module.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBConnection  extends ClassNotFoundException{
    String url="jdbc:mysql://localhost:3306/mydatabase";
    String username="root";
    String password="Priyanka#9032";
     Connection con = null;


    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers loaded successfully!!!!");
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection establish successfully!!!");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return con;

    }

    public void closeConnection(Connection con) throws SQLException {

         con.close();
        System.out.println("Connection closed successfully");
    }
}
