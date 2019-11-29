package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Controller
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeService Eser;
	@GetMapping("/list")
	public String getEmployee(Model model){
		model.addAttribute("employee", Eser.listallemployee());
		System.out.println("hello");
		return "/employee/Elist1";
		}
	@GetMapping("/save")
	public String CreateEmployee(@ModelAttribute("employee") Employee employee) {
		 Eser.CreateEmployee(employee);
		 return "redirect:/api/list";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("emopid") int id) {
		Eser.deleteEmploy(id);
		return "redirect:/api/list";
	}
}
