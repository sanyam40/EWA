import java.sql.*;
public class App{
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","0721");
        Statement stmt=con.createStatement();
        String query="create table detailsss(roll_no int,name varchar(100));";
        stmt.executeUpdate(query);
        System.out.println("TABLE ADDED SUCCESFULLY");
    }
}
