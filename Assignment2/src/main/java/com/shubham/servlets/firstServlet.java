package com.shubham.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class firstServlet
 */
public class firstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public firstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		String param1 = getServletConfig().getInitParameter("message");
		System.out.println(param1.toUpperCase());
		
		String cParam = getServletContext().getInitParameter("first");
		System.out.println(cParam.toUpperCase());
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
//		String email = request.getParameter("email");
//		String password = request.getParameter("password");
		
//		out.print("<h1>email is :"+email+"password is :"+password);
		out.print("<h2>Servlet one </h2>");
		RequestDispatcher rd = request.getRequestDispatcher("secondServlet");
//		rd.forward(request, response);
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
