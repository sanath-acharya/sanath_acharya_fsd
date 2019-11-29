package comm.example.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import comm.example.spring.mvc.model.customer;

@Controller
@RequestMapping("/customer")

public class customerController {
	
	@RequestMapping("/showForm")
	public String showForm(Model themodel) {
		themodel.addAttribute("customer",new customer());
		return "customer-form";
		
		
	}
	@RequestMapping("/processForm")
	public String processForm(@Valid@ModelAttribute("customer") customer theCustomer,BindingResult theResult)
	{
		if(theResult.hasErrors()) {
			return "customer-form";
		}else {
			return "customer-confirmation";
		}
	}
	

}
