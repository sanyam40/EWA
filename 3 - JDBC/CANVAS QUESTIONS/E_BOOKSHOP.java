import java.sql.*;
import java.util.Scanner;

public class E_BOOKSHOP{
    static Scanner sc=new Scanner(System.in);
// DISPLAY DATA
    static public void display_data(Statement stmt) throws SQLException{
        String query="select * from books";
        ResultSet res=stmt.executeQuery(query);

        while(res.next()){
            int id=res.getInt("id");
            String title=res.getString("title");
            String author=res.getString("author");
            float price=res.getFloat("price");
            int qty=res.getInt("qty");

            System.out.println("ID : "+id+" Title : "+title+" Author : "+author+" Price : "+price+" QTY : "+qty);
        }
    }
// ADD DATA
    public static void add_data(Connection con) throws ClassNotFoundException, SQLException{
        System.out.print("ENTER THE ID : ");
        int id=sc.nextInt();
        System.out.print("ENTER THE TITLE : ");
        String title=sc.next();
        System.out.print("ENTER THE AUTHOR : ");
        String author=sc.next();
        System.out.print("ENTER THE PRICE : ");
        float price=sc.nextFloat();
        System.out.print("ENTER THE QTY : ");
        int qty=sc.nextInt();
        System.out.println();

        String q="insert into books (id,title,author,price,qty) values(?,?,?,?,?)";
        PreparedStatement stmt=con.prepareStatement(q);
        stmt.setInt(1, id);
        stmt.setString(2, title);
        stmt.setString(3, author);
        stmt.setFloat(4, price);
        stmt.setInt(5, qty);
        stmt.executeUpdate(); 
    }
// REMOVE DATA
    public static void remove_data(Connection con) throws SQLException{
        System.out.print("ENTER THE ID TO REMOVE DATA : ");
        int id_temp=sc.nextInt();
        System.out.println();

        String query="delete from books where id=?";
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.setInt(1,id_temp);

        stmt.executeUpdate();
    }
//UPDATE DATA
    public static void  update_data(Connection con) throws SQLException{
        System.out.print("ENTER ID TO UPDATE DATA : ");
        int id_temp=sc.nextInt();
        System.out.print("ENTER THE PRICE U WANT TO UPDATE : ");
        float price_new=sc.nextFloat();
        String query="update books set price=? where id=?";
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.setFloat(1, price_new);
        stmt.setInt(2, id_temp);

        stmt.executeUpdate();
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello, Welcome to E-Book Shop. ");
        System.out.println();

        //LOADING THE DRIVER
        Class.forName("com.mysql.cj.jdbc.Driver");

        String user="root";
        String password="0721";
        String url="jdbc:mysql://localhost:3306/e_bookshop";
        Connection con=DriverManager.getConnection(url, user, password);
        Statement stmt=con.createStatement();

        while(true){
            System.out.println("1.FOR INSERTING THE DATA");
            System.out.println("2.FOR DELETING THE DATA ");
            System.out.println("3.FOR DISPLAYING ALL THE DATA");
            System.out.println("4.FOR UPDATING THE DATA");
            System.out.println("5.FOR EXITING");
            System.out.println();
            System.out.print("ENTER YOUR CHOICE : ");
            int input_01=sc.nextInt();

            if(input_01==1){
                add_data(con);

            }
            else if(input_01==2){
                remove_data(con);
            }
            else if(input_01==3){
                display_data(stmt);

            }
            else if(input_01==5){
                break;

            }
            else if(input_01==4){
                update_data(con);
            }
            else{
            }
        }
        sc.close();
    }
}
