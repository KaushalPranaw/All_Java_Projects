package com.app.core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

/**
 * Servlet implementation class Validate
 */
//@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		 System.out.println(name);
		if(name.equals("pranaw"))
		{
			RequestDispatcher dispatcher=
					request.getRequestDispatcher("servlet2");
			dispatcher.forward(request, response);
		}
			 
		else
		{
			out.print("Wrong id and password");
			RequestDispatcher dispatcher=
					request.getRequestDispatcher("/index.html");
			dispatcher.include(request, response);
		}
	}

}
