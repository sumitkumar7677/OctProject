package com.Springcore.DemoProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/Welcome3")
	public String DemoCon() {
		return "This is For Server Check";
	}
	@GetMapping("/Welcome34")
	public String DemoCon2() {
		return "This is for Checking";
	}
	
	
	
}
