package com.mycompany.aaMvcLogin.controller;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.aaMvcLogin.service.customerService;




public class LoginController extends HttpServlet{
	

	@Autowired
	private customerService serv;
	
	@RequestMapping("/Login" )
	public String name()
	{
		return "login";
	}
	@RequestMapping(value = "/formController", method = RequestMethod.GET )
	public String processform(ModelMap model,@RequestParam String firstName,@RequestParam String pass ) {
		
	
		boolean anyerror=true;
		System.out.println(firstName+"l    dsjfljsd");
		//		serv.getValidation(firstName, pass);
		
		if(true) {
			return "todoList";
		}
		else {
			return "Login";
		}
	}
}
