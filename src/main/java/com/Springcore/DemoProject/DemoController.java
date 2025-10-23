package com.Springcore.DemoProject;

import org.springframework.context.support.StaticApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/Welcome34")
	public String DemoCon() {
		return "This is For Server Check";
	
	}
	@GetMapping("/process-form")
	public String getData (@RequestParam int num1, @RequestParam int num2) {
		int res = num1 + num2;
		return "Result  =" + res;
		
		
	}
}
	
	

