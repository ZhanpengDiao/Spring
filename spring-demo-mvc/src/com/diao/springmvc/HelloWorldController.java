package com.diao.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String greeting2(HttpServletRequest request, Model model) {
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
	
	// method to read from data and add data to the model
		@RequestMapping("/processFormVersion3")
		public String greeting3(@RequestParam("stdName") String theName, Model model) {
			// read the request parameter from the HTML form
//			String theName = request.getParameter("stdName");
			
			// convert data
			theName = theName.toUpperCase();
			
			// create msg
			String result = "Hello, " + theName + " from greeting(String, Model).";
			
			// add msg to model
			model.addAttribute("message", result);
			
			return "helloworld";
		}
}
