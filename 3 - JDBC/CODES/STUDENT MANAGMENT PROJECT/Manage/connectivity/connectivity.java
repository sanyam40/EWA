package Manage.connectivity;

import java.sql.*;

public class connectivity {
    static Connection con;

    public static Connection createC() throws SQLException, ClassNotFoundException{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String user="root";
            String password="0721";
            String url="jdbc:mysql://localhost:3306/student";

            con=DriverManager.getConnection(url, user, password);

            return con;
    }
}
