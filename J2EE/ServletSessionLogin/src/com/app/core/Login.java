package com.app.core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
		 PrintWriter out=response.getWriter();
		 request.getRequestDispatcher("link.html").include(request, response);
		 String n=request.getParameter("name");
		 String p=request.getParameter("password");
		 
		 if(p.equals("admin"))
		 {
			 out.println("you are successfully logged in");
			 out.print("Welcome "+ n);
			// response.addCookie(new Cookie("name", n));
			 HttpSession hs=request.getSession();
			 hs.setAttribute("name", n);
		 }
		 else
		 {
			 out.println("wrong user name or password");
			 request.getRequestDispatcher("login.html").include(request, response);
		 }
		 out.close();
	}

}
