package org.cuatrovientos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		 
		 PrintWriter out = response.getWriter();
		 
		 out.println("<html>");
	         out.println("<head>");
	         	out.println("<title>Servlet MoodServlet "+request.getContextPath()+"</title>");
	         out.println("</head>");
         out.println("<body>");
         
         out.println("<h1>Servlet MoodServlet at "+ request.getContextPath() + "</h1>");
         
         String name = (String) request.getParameter("username");
         String password = (String) request.getParameter("password");

         out.println("<p>Your user name is "+name+" and password "+password+" </p>");       

         
         out.println("</body>");
         out.println("</html>");	
	}

}
