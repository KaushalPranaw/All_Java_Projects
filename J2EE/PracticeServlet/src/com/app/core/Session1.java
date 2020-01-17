package com.app.core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Session1
 */
@WebServlet("/Session1")
public class Session1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 try
		 {
			 response.setContentType("text/html");
			 PrintWriter out=response.getWriter();
			 String s=request.getParameter("name");
			 out.println("Welcome "+s);
			 
			 Cookie c=new Cookie("uname", s);
			 response.addCookie(c);
			 out.print("<form action='Session2'>");
			 out.print("<button>submit</button>");
			 out.print("</form>");
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		 
	}

}
