package com.crud;

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
 * Servlet implementation class View_Servlet
 */
public class View_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public View_Servlet() {
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
		doGet(request, response);
	}
	static void mysql(HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","0721");
        Statement stmt=con.createStatement();
        
        String query="select * from studentdetail";
        
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.write("<h3>STUDENT DETAILS</h3>");
        
        ResultSet res=stmt.executeQuery(query);
        out.print("<table border='1' width'100'");
        out.write("<tr><th>Name</th><th>ROLLNO.</th><th>SPECIALISATION</th><th>Edit</th><th>Delete</th></tr>");
        
        while(res.next()) {
        	String name=res.getString("name");
    		String rollno=res.getString("RollNo");
    		String Specialisation=res.getString("Specialisation");
    		
    		out.print("<tr>"+
    		   "<td>"+name+"</td>"
    		   +"<td>"+rollno+"</td>"
    		   +"<td>"+Specialisation+"</td>"
    		   +"<td><a href='/crud_operations/EditServlet?id="+rollno+"'>edit</a></td>"
        	   +"<td><a href='/crud_operations/Delete_Servlet?id="+rollno+"'>delete</a></td>"
    		   +"</tr>");
        }
	}

}
