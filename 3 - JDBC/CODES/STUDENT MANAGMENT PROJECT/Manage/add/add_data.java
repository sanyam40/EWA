package Manage.add;

import java.util.Scanner;
import java.sql.*;
import Manage.connectivity.connectivity;
import Manage.details.*;

public class add_data{
    static Scanner sc=new Scanner(System.in);
    
    public static void input() throws ClassNotFoundException, SQLException{
        System.out.print("ENTER THE ROLL_NO : ");
        int roll=sc.nextInt();
        System.out.print("ENTER THE NAME : ");
        String name=sc.next();
        System.out.print("ENTER THE PHN_NO : ");
        String phn=sc.next();
        System.out.println();
        student s=new student(roll,name,phn);
        Boolean a=insert_to_database(s);
        if(a){
            System.out.println("DETAILS ARE ADDED SUCCESFULLY");
            System.out.println(s);
            System.out.println();
        }
        else{
            System.out.println("ERROR !!");
        }
    }

    public static boolean insert_to_database(student s) throws ClassNotFoundException, SQLException{
        boolean f=false;
        Connection con=connectivity.createC();
        String q="insert into students(roll_no,name,phn_no) values(?,?,?)";
        PreparedStatement stmt=con.prepareStatement(q);
        stmt.setInt(1, s.getRollno());
        stmt.setString(2, s.getName());
        stmt.setString(3, s.getPhoneno());

        stmt.executeUpdate();
        f=true;

        return f;
    }
}
