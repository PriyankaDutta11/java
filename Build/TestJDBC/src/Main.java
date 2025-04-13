import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url="jdbc:mysql://localhost:3306/mydatabase";
        String username="root";
        String password="Priyanka#9032";
        String query="Select * from employee;";
        List<Employee> empList = new ArrayList<>();
        ResultSet rs = null;
        Statement stmt = null;
        Connection con = null;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers loaded successfully!!!!");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            con=DriverManager.getConnection(url,username,password);
            System.out.println("Connection establish successfully!!!");
            stmt=con.createStatement();
            rs=stmt.executeQuery(query);
            while(rs.next()){
//                Employee emp = new Employee(rs.getInt("id"),
//                        rs.getString("name"),
//                        rs.getString("job_title"),
//                        rs.getDouble("salary"));

                Employee emp1 = new Employee();

                emp1.setId(rs.getInt("id"));
                emp1.setName( rs.getString("name"));
                emp1.setJob_title(rs.getString("job_title"));
                emp1.setSalary(rs.getDouble("salary"));


                int id = rs.getInt("id");
                String name=rs.getString("name");
                String job_title=rs.getString("job_title");
                double salary = rs.getDouble("salary");
                System.out.println("************");
                System.out.println("ID:"+id);
                System.out.println("Name :"+name);
                System.out.println("job_title :"+job_title);
                System.out.println("Salary:"+salary);
                empList.add(emp1);

            }
            System.out.println(":::::: empList ::::::  "+ empList);
            System.out.println("Connection closed successfully");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally {
//            rs.close();
//            stmt.close();
            con.close();

        }
    }
}
