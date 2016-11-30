package com.virtusa.project.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.virtusa.project.ui.service.UiServices;

public class UpdateUser extends HttpServlet {
	
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("memberId") != null) {
			String memberId = request.getParameter("memberId");
			UiServices uiServices = new UiServices();
			if(uiServices.validateMemberId(Integer.parseInt(memberId))){
				HttpSession httpSession = request.getSession();
				String memberString = uiServices.getMemberString(Integer.parseInt(memberId));
				PrintWriter out = response.getWriter();
				httpSession.setAttribute("memberString", memberString);
				/*RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/update_member.jsp");
				requestDispatcher.forward(request, response);*/
				response.sendRedirect("admin/update_member.jsp");
			}else{
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/update_member_by_id.jsp");
				requestDispatcher.forward(request, response);
			}
			
		}
		
	}

}
