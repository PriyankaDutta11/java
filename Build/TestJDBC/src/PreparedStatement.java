import javax.xml.transform.Result;
import java.sql.*;
public class PreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Priyanka#9032";
        String query = "select * from employee where name=?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers loaded successfully!!!!");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
//        try {
//            Connection con = DriverManager.getConnection(url, username, password);
//            System.out.println("Connection establish successfully!!!");
//            PreparedStatement preparedStatement = con.prepareStatement();
//            preparedStatement.setString(1, "Hemant");
//            ResultSet resultSet=
//}
//            con.close();
//            System.out.println();
//            System.out.println("Connection closed successfully");
//
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
    }
}



