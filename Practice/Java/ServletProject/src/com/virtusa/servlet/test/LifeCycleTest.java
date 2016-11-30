package com.virtusa.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class LifeCycleTest
 */
@WebServlet("/LifeCycleTest")
public class LifeCycleTest extends GenericServlet {
	private static final long serialVersionUID = 1L;
	public LifeCycleTest() {
		// TODO Auto-generated constructor stub
		System.out.println("const");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
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
			out.println("<h1>LMS</h1>");
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("after creating");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("after obj deletion");
	}

}
