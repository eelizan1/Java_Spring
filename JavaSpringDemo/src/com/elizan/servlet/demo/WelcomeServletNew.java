package com.elizan.servlet.demo;

import java.io.IOException;
import java.util.*; 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// import package "business logic" 
import com.elizan.service.demo.WelcomeService;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServletNew")
public class WelcomeServletNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServletNew() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * doGet method get data that can be displayed 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Create the data (model) and add to request object 
		// gets data that we want to display from the WelcomeService.java 
		// WelcomeService.java is in the com.service.demo package
		
		// create welcomeService object
		WelcomeService welcomeService = new WelcomeService(); 
		// create message list - will return welcome message 
		List<String> welcomeMessage = welcomeService.getWelcome("Enrico"); 
		request.setAttribute("myWelcomeMessage", welcomeMessage);
		
		// 2. Retrieve request dispatcher - mechanism to send information, welcomeMessage, to jsp file  
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcomeNew.jsp"); 
		
		// 3. Forward request to the view (jsp file) 
		requestDispatcher.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}