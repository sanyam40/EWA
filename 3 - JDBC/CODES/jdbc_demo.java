import java.sql.*;

public class jdbc_demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","0721");
        Statement stmt=con.createStatement();

        /* CREATING TABLE
        String query="create table details(roll_no int,name varchar(100));";
        stmt1.executeUpdate(query);
        System.out.println("TABLE ADDED SUCCESFULLY"); */

        // INSERTING DATA IN TABLE
        String query2="insert into details values(234,'SANYAM'),"+"(XXXXX,'XXXXXXX'),"+"(376,'ABC')";
        if (stmt.executeUpdate(query2) == 1) {
            System.out.println("Insertion failed!!");
        } else {
            System.out.println("Data inserted successfully!!");
        }

        // UPDATE DATA
        String query3="UPDATE details set name='sahil' where roll_no =376";
        stmt.executeUpdate(query3);

        // delete a record
        String query4 = "DELETE from employee where id = 234";
        stmt.executeUpdate(query4);

        // Fetch the data from the database
        String query5 = "SELECT * from employee";

        ResultSet res = stmt.executeQuery(query5);

        while (res.next()) {
            int roll_no = res.getInt("roll_no");
            String name = res.getString("name");

            System.out.println("Roll_no: " + roll_no + " Name: " + name);
        }
        System.out.println("Operation successfully completed!!");

        // Step 5: close the connection
        stmt.close();
        con.close();
    }
}
}
