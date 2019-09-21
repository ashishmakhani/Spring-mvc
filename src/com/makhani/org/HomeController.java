package com.makhani.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String Showpage() {
		
		return "main-menu";
	}
}
