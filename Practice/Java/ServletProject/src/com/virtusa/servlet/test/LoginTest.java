package com.virtusa.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class LoginTest
 */
@WebServlet("/login")
public class LoginTest extends GenericServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("username");
		String passwd = request.getParameter("passwd");

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
		if(userName.equals("asdf") && passwd.equals("asdf")){
			out.println("Username : " + userName);
			out.println("Password : " + passwd);
		}else{
			out.println("Wrong Input");
		}
			out.println("<h1>LMS</h1>");
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
