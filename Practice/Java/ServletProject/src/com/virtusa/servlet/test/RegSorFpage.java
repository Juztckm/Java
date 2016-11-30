package com.virtusa.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegSorFpage
 */
//@WebServlet("/RegSorFpage")
public class RegSorFpage extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	Connection connection = null;
	
//	@Override
//	public void init(ServletConfig config) throws ServletException {
//		// TODO Auto-generated method stub
//		super.init(config);
//		try {
//			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
//			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	@Override
	public void init(){
		ServletConfig servletConfig = getServletConfig();
		
		System.out.println("in init");
		try {
			Class.forName(servletConfig.getInitParameter("driverClass"));
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String s1=servletConfig.getInitParameter("dburl");
        String s2=servletConfig.getInitParameter("dbuser");            
        String s3=servletConfig.getInitParameter("dbpwd");
        
        try {
			connection = DriverManager.getConnection(s1, s2, s3);
			System.out.println("after connection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		try {
			System.out.println("in destroy");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String email = request.getParameter("email");
		String passwd = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		//int age = Integer.parseInt(request.getParameter("age")+"");
		String age = request.getParameter("age");
		String desg = request.getParameter("desg");
		String doj = request.getParameter("doj");
		String city = request.getParameter("city");
		String techJava = request.getParameter("java");
		String techOracle = request.getParameter("oracle");
		String techC = request.getParameter("C");
		String techCpp = request.getParameter("cpp");
		String area = request.getParameter("area");
		System.out.println("in do post");
		
			try {
				//Statement statement = connection.createStatement();//ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE
				String query = "insert into registert values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, firstName);
				preparedStatement.setString(2, lastName);
				preparedStatement.setString(3, email);
				preparedStatement.setString(4, passwd);
				preparedStatement.setString(5, gender);
				preparedStatement.setString(6, age);
				preparedStatement.setString(7, desg);
				preparedStatement.setString(8, doj);
				preparedStatement.setString(9, city);
				preparedStatement.setString(10, techJava);
				preparedStatement.setString(11, techOracle);
				preparedStatement.setString(12, techC);
				preparedStatement.setString(13, techCpp);
				preparedStatement.setString(14, area);
				preparedStatement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
				out.println("<meta charset=\"UTF-8\">");
				out.println("<title>");
				out.println("First");
				out.println("</title>");
			out.println("</head>");
			out.println("<body>");
				out.println("Chandan Kumar Meher " + new Date());
				out.println("<meta http-equiv=\"refresh\" content=\"0; url=http://localhost:9595/ServletProject/login.html\" />");
			out.println("</body>");
			out.println("</html>");
		
	}

}
