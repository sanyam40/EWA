package read_data_jee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class view_servlet
 */
public class view_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public view_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			mysql(response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	static void mysql(HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","0721");
        Statement stmt=con.createStatement();
        
        String query="Select * from user_info";
        
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.write("<h3>personal data</h3>");
        
        ResultSet res=stmt.executeQuery(query);
        out.print("<table border='1' width'100'");
        out.write("<tr><th>username</th><th>password</th><th>gender</th><th>age</th><th>language</th><th>instructions</th></tr>");
        
        while(res.next()) {
        	String username=res.getString("username");
    		String password=res.getString("password");
    		String gender=res.getString("gender");
    		int age=res.getInt("age");
    		String language=res.getString("language");
    		String intructions=res.getString("instructions");
    		
    		out.print("<tr>"+
    		   "<td>"+username+"</td>"
    		   +"<td>"+password+"</td>"
    		   +"<td>"+gender+"</td>"
    		   +"<td>"+age+"</td>"
    		   +"<td>"+language+"</td>"
    		   +"<td>"+intructions+"</td></tr>");
        }
	}
	
	

}
