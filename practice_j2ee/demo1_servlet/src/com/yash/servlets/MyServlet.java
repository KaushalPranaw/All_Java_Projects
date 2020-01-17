package com.yash.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyServlet() {
	}

	@Override
	public void init() throws ServletException {
		System.out.println("in init");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("in do get");
		PrintWriter pw = response.getWriter();
		pw.write("My First Servlet Program");
	}

	@Override
	public void destroy() {
		System.out.println("in destroy");
	}

}
