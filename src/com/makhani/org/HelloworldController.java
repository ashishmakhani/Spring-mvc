package com.makhani.org;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloworldController {
	
	// need a controller method to show initial html form
	
	@RequestMapping("/showform")
	public String showform() {
		
		return "helloworld-form";
	}
	
	// need a controller method to process html form
	@RequestMapping("/processform")
	public String processform() {
		
		return "helloworld";
	}

	// method to read from data and add data to model
	@RequestMapping("/processformtwo")
	public String uppercase(HttpServletRequest request, Model model) {
	
	String name = request.getParameter("studentname");
	
	name = name.toUpperCase();
	
	String result = "Hello " + name;
	
	model.addAttribute("message",result);
	
	return "helloworld";
	
}
	
	// method to read from data and add data to model using @requestparam
		@RequestMapping("/processformthree")
		public String requestparam
		(@RequestParam("studentname")String name, Model model) {
		
		name = name.toUpperCase();
		
		String result = "Hey..!! " + name;
		
		model.addAttribute("message",result);
		
		return "helloworld";
		
	}
}