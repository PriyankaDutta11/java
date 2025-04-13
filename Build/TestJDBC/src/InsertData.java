import java.sql.*;
public class InsertData {

        public static void main (String[] args) throws ClassNotFoundException{
            String url="jdbc:mysql://localhost:3306/mydatabase";
            String username="root";
            String password="Priyanka#9032";
            String query=" INSERT INTO employee(id,name,job_title,salary)VALUES(10,'Sumit','Full Stack Web Developer',90000);";
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Drivers loaded successfully!!!!");
            }catch(ClassNotFoundException e){
                System.out.println(e.getMessage());
            }
            try{
                Connection con=DriverManager.getConnection(url,username,password);
                System.out.println("Connection establish successfully!!!");
                Statement stmt=con.createStatement();
                int rowsaffected=stmt.executeUpdate(query);
                if(rowsaffected>0) {
                    System.out.println("Insert succesfully" + rowsaffected + "row(s) affected");
                }else {
                    System.out.println("Insertion failed");
                }


                stmt.close();
                con.close();
                System.out.println();
                System.out.println("Connection closed successfully");


            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }

