package com.example.sleuth.demosleuth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SleuthController {
	
	
	Logger logger= LoggerFactory.getLogger(this.getClass());
	@GetMapping("/sup")
	public String Hii() {
		
		logger.info("");
		return "Yooo";
	}

}
