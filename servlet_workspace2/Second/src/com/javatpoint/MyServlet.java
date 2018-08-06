package com.javatpoint;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("Myservlet page");
		out.println();
		String str=request.getParameter("UserName");
		String pass=request.getParameter("Password");
		out.println();
		out.println(" it is time to validate  the password");
		
		if(pass.equals("urmi"))
		{
		//	RequestDispatcher rd= request.getRequestDispatcher("Welcome.html");
			
			RequestDispatcher rd= request.getRequestDispatcher("Successpage");
			
			rd.forward(request, response);						
		}
		else
		{
			RequestDispatcher rd= request.getRequestDispatcher("index.html");
			rd.include(request, response);		
		}
	}

	

}
