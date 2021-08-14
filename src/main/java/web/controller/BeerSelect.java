package web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.model.BeerExpert;

/**
 * Servlet implementation class BeerSelect
 */
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		
		String c=request.getParameter("color");
		System.out.println(c);
		
		BeerExpert be = new BeerExpert();
		List result=be.getBrands(c); // brown
		
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("/result.jsp");
		view.forward(request, response);
				
	}

}
