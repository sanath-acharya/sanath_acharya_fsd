package com.example.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.example.DAO1.CustomerDAOImpl1;
import com.example.DAO1.customerDAO1;
import com.example.model.Customer;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    List<String> errors=null;
    private String fName, lName, address, customerType;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);	}
	
	protected void doProcess(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		errors=new ArrayList<String>();
		
		fName=request.getParameter("fName");
		if ((fName == null) || (fName.length() < 5)) {
			errors.add("First name cannot be null or less than 5 chars");
		}
		lName = request.getParameter("lName");
		if ((lName == null) || (lName.length() < 5)) {
			errors.add("Last name cannot be null or less than 5 chars");
		}
		address = request.getParameter("address");
		if ((address == null)) {
			errors.add("Enter address");
		}
		customerType = request.getParameter("custType");
		if (customerType.equals("Unknown")) {
			errors.add("Select a customer type");
		}
		
		if (!errors.isEmpty()) {
			request.setAttribute("ERROR", errors);
			RequestDispatcher rd = request.getRequestDispatcher("add_customer.jsp");
			rd.forward(request, response);
		} else {
			Customer c =  new Customer(fName, lName, address, customerType);
			request.setAttribute("SUCCESS", c);
			customerDAO1 dao1 = new CustomerDAOImpl1();
			dao1.createCustomer(c);
			RequestDispatcher rd = request.getRequestDispatcher("list_customer.jsp");
			rd.include(request, response);
		}
	}
}
