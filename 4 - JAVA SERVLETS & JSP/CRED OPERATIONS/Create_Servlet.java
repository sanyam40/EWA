package com.crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Create_Servlet
 */
public class Create_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Create_Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name=request.getParameter("name");
		String roll_no=request.getParameter("RollNo");
		String Specialisation=request.getParameter("Specialisation");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.write("<html><body><h3> your DATA is submitted </h3></body></html>");
		out.write("<a href='/crud_operations/View_Servlet'>TAKE ME TO THE DATA SAVED </a>");
		try {
			mysql(name,roll_no,Specialisation);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void mysql(String name,String roll_no,String Specialisation) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","0721");
        String query="insert into studentdetail(name,RollNo,Specialisation) values(?,?,?)";
        PreparedStatement stmt=con.prepareStatement(query);
        
        stmt.setString(1,name);
        stmt.setString(2,roll_no);
        stmt.setString(3,Specialisation);
        
        stmt.executeUpdate();
	}

}
