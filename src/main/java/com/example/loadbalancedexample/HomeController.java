package com.example.loadbalancedexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${server.number}")
	private Integer serverNumber;

	@GetMapping("/")
	public Integer home() {
		return serverNumber;
	}
}
