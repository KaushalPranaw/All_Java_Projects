package com.app.core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("txt/html");
		
		try(PrintWriter out=response.getWriter())
		{
			String name=request.getParameter("name");
			String password=request.getParameter("password");
			LoginBean bean=new LoginBean();
			bean.setName(name);
			bean.setPassword(password);
			
			request.setAttribute("bean", bean);
			
			boolean status=bean.isValidate();
			System.out.println(status);
			if(status)
			{
				RequestDispatcher rd=request.getRequestDispatcher("login_success.jsp");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
			}
		}
	}

}
