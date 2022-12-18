package com.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet
 */
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: EDIT SERVLET").append(request.getContextPath());
		try {
			mysql(request,response);
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
		doGet(request, response);
	}
	static void mysql(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String id=request.getQueryString();
		String ids[]=id.split("=");
		String rollno=ids[1];
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","0721");
        
        String query = "select * from studentdetail where RollNo = ?";
		
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, rollno);
		
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			out.print("<form action='/crud_operations/UpdateServlet?id="+rollno+"' method='post'>");  
            out.print("<table>");  
            out.print("<tr><td>RollNo:</td><td><input type='text' RollNo='RollNo' value='"+rollno+"' disabled/></td></tr>");    
            out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+rs.getString(1)+"'/></td></tr>");     
            out.print("<tr><td>Specilisation:</td><td><input type='text' name='Specilisation' value='"+rs.getString(3)+"'/></td></tr>");
            out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save'/></td></tr>");  
            out.print("</table>");  
            out.print("</form>");  
		}
	}

}
