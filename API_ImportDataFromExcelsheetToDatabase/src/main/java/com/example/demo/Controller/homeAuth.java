package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeAuth {
	
	@RequestMapping("/welcome")
	public String welcome() {
		
		String text = "this is a private page";
		return text;
	}
}
