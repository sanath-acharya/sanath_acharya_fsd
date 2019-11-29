package comm.example.springDemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import comm.example.springDemo.model.Customer;

@RequestMapping("customer")
public class CustomerController {
	@GetMapping("/list")
	public String listcustomer(Model theModel) {
		
		list<Customer> thecustomer=customerService.getCustomer();
		theModel.addAttribute("customer",thecustomer);
		return "list-customer";
	}

}
