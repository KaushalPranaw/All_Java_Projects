package pages_session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CustomerDaoImpl;
import pojo.Customer;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns="/login_session", loadOnStartup=1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CustomerDaoImpl dao;
    
	@Override
	public void init() throws ServletException {
		System.out.println("in init");
		try {
			dao= new CustomerDaoImpl();
		} catch (Exception e) {
			throw new ServletException("err in init "+getClass().getName(),e);
		}
	}
	
	@Override
	public void destroy() {
		System.out.println("in destroy");
		if(dao!=null)
			try {
				dao.cleanUp();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		try(PrintWriter out=response.getWriter())
		{
			String e=request.getParameter("email");
			String p=request.getParameter("pass");
			
			Customer c=dao.validateCust(e, p);
			if(c==null)
			{
				out.println("<h4 align=center> Invalid Login , Pls <a href='login.html'>Retry</a></h4>");
			}
			else
			{
				HttpSession hs=request.getSession();
				System.out.println("from first page "+hs.isNew());
				System.out.println("session id "+hs.getId());
				hs.setAttribute("cust_dtls", c);
				response.sendRedirect("display_session");
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			throw new ServletException("err in do-get of " + getClass().getName(), e);
		}
		
	}

	 
}
