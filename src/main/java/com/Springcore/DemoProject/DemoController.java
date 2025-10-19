package com.Springcore.DemoProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/Welcome34")
	public String DemoCon() {
		return "This is For Server Check";
	}
	@GetMapping("/Welcome35345")
	public String DemoCon3() {
		return "This is for Checking";
	}
	
	
	
}
