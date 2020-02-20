package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String launcher() {
		
		return "home";
	}

	@RequestMapping("/addstudent")
	public String process(int roll,String name,int marks,Model m) {
		
		m.addAttribute("rl", roll);
		m.addAttribute("nm", name);
		m.addAttribute("mr", marks);
		
		
		return "result";
	}
	
	
	
	
	
}
