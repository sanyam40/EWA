package Manage.delete;

import java.util.Scanner;
import java.sql.*;
import Manage.connectivity.connectivity;

public class delete_data {
    static Scanner sc=new Scanner(System.in);
    
    public static void delete() throws ClassNotFoundException, SQLException{
        System.out.print("ENTER THE ROLL_NO TO DELETE DATA FOR : ");
        int delete_rollno=sc.nextInt();
        System.out.println();

        boolean f=false;
        Connection con=connectivity.createC();
        String q="delete from students where roll_no=?";
        PreparedStatement stmt=con.prepareStatement(q);
        stmt.setInt(1,delete_rollno);

        stmt.executeUpdate();
        f=true;

            if(f){
                System.out.println("DETAILS ARE DELETED SUCCESFULLY !!");
                System.out.println();
            }
            else{
                System.out.println("ERROR !!");
            }
        }
    }
