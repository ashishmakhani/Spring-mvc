package com.makhani.org;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showform")
	public String showform(Model model) {
		
		//Create a student object
		Student student = new Student();
		
		// add student obj to model
		model.addAttribute("student", student);
		
		return "student-form";
		
	}

	@RequestMapping("/processform")
	public String processform(@ModelAttribute("student") Student student) {
		
		return "student-confirmation";
		
	}
}
