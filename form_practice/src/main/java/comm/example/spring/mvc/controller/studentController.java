package comm.example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import comm.example.spring.mvc.model.student;

@Controller
@RequestMapping("/student")
public class studentController {
	@RequestMapping("/showForm")
	public String showForm(Model themodel) {
		themodel.addAttribute("student",new student());
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") student student,Model theModel)
	{
		theModel.addAttribute("student",student);
		
		return "process-form";
	}

}
