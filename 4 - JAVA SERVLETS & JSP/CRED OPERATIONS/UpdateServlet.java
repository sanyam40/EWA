package com.crud;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
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
		String id=request.getQueryString();
		String ids[]=id.split("=");
		String rollnoo=ids[1];
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","0721");
        
        String RollNo=rollnoo;
        String name=request.getParameter("name");
        String Specialisation=request.getParameter("Specialisation");
        
        PreparedStatement ps=con.prepareStatement("update studentdetail set name=?,Specialisation=? where RollNo = ?");  
        ps.setString(1,name);  
        ps.setString(2,Specialisation);  
        ps.setString(3,RollNo);  
          
        int status=ps.executeUpdate();
        if(status==1) {
        	System.out.println("EDIT DONE !!");
        }
        else {
        	System.out.println("ERROR !!");
        }
        
        response.sendRedirect("/crud_operations/View_Servlet");
           
	}
		catch(Exception ex){ex.printStackTrace();}  
	}

}
