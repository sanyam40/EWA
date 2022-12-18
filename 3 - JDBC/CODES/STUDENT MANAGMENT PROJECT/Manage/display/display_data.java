package Manage.display;

import Manage.connectivity.connectivity;
import java.sql.*;

public class display_data {

    public static void display() throws SQLException, ClassNotFoundException {
        Connection con= connectivity.createC();
        String q="select * from students;";
        Statement stmt=con.createStatement();
        ResultSet set=stmt.executeQuery(q);
        while(set.next()){
            int roll=set.getInt(1);
            String name=set.getString(2);
            String phn_no=set.getString(3);

            System.out.println("ROLL_NO : "+roll);
            System.out.println("NAME : "+name);
            System.out.println("PHN_NO : "+phn_no);
            System.out.println();
        }
    }
}
