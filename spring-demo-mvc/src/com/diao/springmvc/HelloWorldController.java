package com.diao.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	// a controller method to show the initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// to process the HTML form
	@RequestMapping("processForm")
	public String processform() {
		return "helloworld";
	}

	
	// method to read from data and add data to the model
	@RequestMapping("/processFormVersion2")
	public String greeting(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML form
		String theName = request.getParameter("stdName");
		
		// convert data
		theName = theName.toUpperCase();
		
		// create msg
		String result = "Hello, " + theName + ".";
		
		// add msg to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
