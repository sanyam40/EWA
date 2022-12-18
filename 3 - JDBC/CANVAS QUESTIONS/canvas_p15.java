// SANYAM 21CSU234 FS-III-A

import java.sql.*;

public class canvas_p15 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "0721");
        Statement stmt=con.createStatement();

        String query="select * from emp";
        ResultSet res=stmt.executeQuery(query);

        while(res.next()){
            int emp_no=res.getInt("emp_no");
            String name=res.getString("e_name");
            int age=res.getInt("age");
            int salary=res.getInt("salary");

            System.out.println("EMP NO  : "+emp_no + "EMP NAME : "+name+"AGE : "+age+"SALARY : "+salary);
        }
    }
    
}
