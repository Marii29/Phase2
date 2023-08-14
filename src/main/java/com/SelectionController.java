package com;

import java.io.IOException;
import more.*;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SelectionController
 */
public class SelectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Details d = new Details();
		HttpSession session = request.getSession();
		
		d.setDate(request.getParameter("date"));
		d.setPassengers(Integer.parseInt(request.getParameter("passengers")));
		d.setSrcdestination(request.getParameter("home"));
		d.setEnddestination(request.getParameter("end"));//insert end destination here
		session.setAttribute("details", d);
		
		String date = d.getDate();
		String home = d.getSrcdestination();
		String end = d.getEnddestination();
		int passengers = d.getPassengers();
		
		//RequestDispatcher rd = null;
		if(date.isEmpty() || home.isEmpty() || passengers == 0 || end.isEmpty()) {
			//rd = request.getRequestDispatcher("Home.html");
			PrintWriter out = response.getWriter();
			//rd.include(request, response);
			out.println(("<center> <span style='color:red'>Please insert valid details</span></center>"));
			
		}else {
			//rd = request.getRequestDispatcher("AvailableFlights");
			//rd.forward(request, response);
			response.sendRedirect("AvailableFlights.html");
		}
	}

}
