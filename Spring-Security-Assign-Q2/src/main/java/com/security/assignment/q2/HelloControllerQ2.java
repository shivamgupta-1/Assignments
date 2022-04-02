package com.security.assignment.q2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerQ2 {
	
	@GetMapping({ "/helloq2" })
	public String sayHello() {
		return "Hello World Q2";
	}
}
	