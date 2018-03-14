package com.diao.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) { // in the HelloWorldController, there is no model as arg
		
		// create student obj
		Student std = new Student();
		
		// add stu obj as model attribute
		theModel.addAttribute("student", std);
		
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student std) {
		
		// log the input data
		System.out.println("student: " + std.getFirstName() + " " + std.getLastName());
		
		return "student-confirmation";
	}
}
