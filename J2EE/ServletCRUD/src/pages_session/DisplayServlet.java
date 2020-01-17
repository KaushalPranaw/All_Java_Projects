package pages_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pojo.Customer;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/display_session")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			pw.print("from redirected page....<br>");
			//get HS from WC
			HttpSession hs123=request.getSession();
			System.out.println("from 2nd page "+hs123.isNew());
			System.out.println("sess id"+hs123.getId());
			Customer c=(Customer)hs123.getAttribute("cust_dtls");
			if(c != null)
				pw.print("Cust dtls "+c);
			else 
				pw.print("Session tracking failed!!!!");
			pw.print("<br><a href='logout_session'>Log Me Out </a>" );
		} catch (Exception e) {
			throw new ServletException("err in do-get of " + getClass().getName(), e);
		}
	}

	 

}
