package com;

import java.io.IOException;
import more.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class AvailableFlights
 */
public class AvailableFlights extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AvailableFlights() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		
		if (session != null) {
			
			PrintWriter out = response.getWriter();
			out.println("<h2> Welcome to your flight details! </h2>");
			
			Details d = (Details) session.getAttribute("details");
			
			out.println("<li> Hello "+ d.getDate() + " </li>");
			out.println("<li> Hello "+ d.getSrcdestination() + " </li>");
			out.println("<li> Hello "+ d.getPassengers() + " </li>");
			out.println("<li> Details ..  "+ d + " </li>");
			out.println("<li> Session Id is "+ session.getId() + " </li>");
			out.println("<li> Session created at "+ session.getCreationTime() + " </li>");
			session.invalidate();
			
		}
		
	
	}

}
