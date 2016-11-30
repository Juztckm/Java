package com.virtusa.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GenericServletTest
 */
//@WebServlet("/GenericServletTest")
public class GenericServletTest extends GenericServlet {
	private static final long serialVersionUID = 1L;
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//	}
	@Override
	public void service(ServletRequest arg0, ServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
