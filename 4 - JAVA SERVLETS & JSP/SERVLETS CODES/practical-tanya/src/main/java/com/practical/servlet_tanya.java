package com.practical;

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
 * Servlet implementation class servlet_tanya
 */
public class servlet_tanya extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public servlet_tanya() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try {
			mysql(request,response);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void mysql(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
		String input=request.getParameter("INPUT");
		int no=Integer.parseInt(input);
		System.out.println(no);
		response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practical_tanya","root","0721");
			Statement stmt=con.createStatement();
			String query="select * from conversion";
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				int value=rs.getInt("value");
				System.out.println(value);
				int ans=no*value;
				String unit=rs.getString("unit");
				System.out.println(ans);
				out.write("<h2>"+ans+" "+unit+"</h2>");
			}

			
	}

}
