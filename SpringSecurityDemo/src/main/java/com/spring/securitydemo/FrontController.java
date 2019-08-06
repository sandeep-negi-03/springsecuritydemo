package com.spring.securitydemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontController {

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
}
