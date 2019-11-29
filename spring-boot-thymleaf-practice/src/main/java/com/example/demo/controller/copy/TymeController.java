package com.example.demo.controller.copy;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Controller	
@RequestMapping("employees")
public class TymeController {
	@Autowired
	private EmployeeService empservice;
@RequestMapping("/")
	public String gotohellowold(Model thmodel) {
		thmodel.addAttribute("data",new Date());
		return "helloWorld";
	}

	@GetMapping("/list")
	public String getAllemployee(Model mdl) {
		
		mdl.addAttribute("employeeeesModel",empservice.getEmployee());
		return "EmployeeData";
	}
	
	@GetMapping("/showformforadd")
	public String showform(Model themodel) {
		
		Employee emp=new Employee();
		themodel.addAttribute("employee",emp);
		
		return "showform";
	}
	
	@PostMapping("/save")
	public String createEmployee(@ModelAttribute("employee") Employee empl)
	{
	empservice.createEmployee(empl);
	
	return "redirect:/employees/list";
	
	}
	@GetMapping("/showformforupdate")
	public String updateEmployee(@RequestParam("empid") int theid,Model md) {
		
		Employee emp=empservice.findbyid(theid);
		md.addAttribute("employee", emp);
		
		return "employee-form";
	}
	@GetMapping("/delete")
	public String deleteEmplye(@RequestParam("empid") int tid)
	{
		empservice.deleteById(tid);
		return "redirect:/employees/list";
	}
	@GetMapping("/search")
	public String search(@RequestParam("firstname") String fname,@RequestParam ("lastname") String lname, Model thmodel ) {
	
		if(fname.trim().isEmpty()&&lname.trim().isEmpty()) {
			
			return "redirect:/employees/list";
		}else {
			List<Employee> result=empservice.searchbyany(fname,lname);
			System.out.println( " fdsfadsf"+result.isEmpty());
			thmodel.addAttribute("employeeeesModel", result);
			return "EmployeeData";
		}
		
		
	}
	

}
//@GetMapping("/showformForAdd")
//public String
//
//}
