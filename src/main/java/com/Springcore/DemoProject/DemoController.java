package com.Springcore.DemoProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/")
	public String DemoCon() {
		return "This is For Server Check";
	}
	
	
}
