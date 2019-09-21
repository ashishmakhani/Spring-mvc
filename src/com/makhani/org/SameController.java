package com.makhani.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SameController {
	
	@RequestMapping("/showform")
	public String displayform() {
		
		return "samehelloworld";
	}

}
