package com.example.hystrix.demohystrix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HystrixController {

	@GetMapping("/payal")
	@HystrixCommand(fallbackMethod="fallbackJain")
	public String jain() {
		throw new RuntimeException();
	}
	
	public String fallbackJain(){
		
		return "Fallback Lokesh";
		
	}
}
