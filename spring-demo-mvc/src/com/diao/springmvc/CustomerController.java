package com.diao.springmvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// add an initbinder
	// preprocessing all incoming request
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true); // true: all whitespace trim down to null
		binder.registerCustomEditor(String.class, ste);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model m) {
		m.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingRes) {
		if(bindingRes.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
	}
}
