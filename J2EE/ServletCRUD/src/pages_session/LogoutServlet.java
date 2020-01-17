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

 
@WebServlet("/logout_session")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			pw.print("from logout page....<br>");
			// HS
			HttpSession hs = request.getSession();
			System.out.println("from last page " + hs.isNew());
			System.out.println("session id " + hs.getId());
			Customer c = (Customer) hs.getAttribute("cust_dtls");
			if (c != null)
				pw.print("<h4>Hello " + c.getName() + " , you have logged out successfully!!!</h4>");
			else
			pw.print("No Cookies : session tracking failed!!!!");
			//HS invalidate
			hs.invalidate();

			pw.print("<h5><a href='index.html'>Visit Again</a></h5>");
		} catch (Exception e) {
			throw new ServletException("err in do-get of " + getClass().getName(), e);
		}
	}

	 

}
