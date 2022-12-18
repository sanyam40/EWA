package org.ncu.demo;

import java.beans.Statement;
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
 * Servlet implementation class demooo_ncu
 */
public class demooo_ncu extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public demooo_ncu() {
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
		// doGet(request, response);
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		String gender=request.getParameter("gender");
		String temp=request.getParameter("age");
		int age=Integer.parseInt(temp);
		String temp2[]=request.getParameterValues("language");
		String language="";
		for(int i=0;i<temp2.length;i++) {
			language=language+temp2[i];
		}
		String intructions=request.getParameter("instruction");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.write("<html><body><h3> your DATA is submitted </h3></body></html>");
		try {
			msqlconnection(name,pass,gender,age,language,intructions);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		out.close();
		
		
	}
	static void msqlconnection(String username,String password,String gender,int age,String language,String instructions) throws ClassNotFoundException, SQLException {
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","0721");
        String q="insert into user_info(username,password,gender,age,language,instructions) values(?,?,?,?,?,?)";
        PreparedStatement stmt2=con.prepareStatement(q);
        stmt2.setString(1,username);
        stmt2.setString(2,password);
        stmt2.setInt(4,age);
        stmt2.setString(3,gender);
        stmt2.setString(5,language);
        stmt2.setString(6,instructions);

        stmt2.executeUpdate();
        System.out.println("DETAILS SAVED !!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	} 

}
