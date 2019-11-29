package com.example.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.DAO1.CustomerDAOImpl1;
import com.example.DAO1.customerDAO1;
import com.example.model.Customer;

/**
 * Servlet implementation class list_league
 */

public class list_league extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		customerDAO1 dao1=new CustomerDAOImpl1();
		System.out.println("calling get call cuatomer");
		List<Customer> list=dao1.getALLCustomers();
		request.setAttribute("LIST", list);
		RequestDispatcher view = request.getRequestDispatcher("list_customer.jsp");
		view.forward(request, response);
	}

	
}
