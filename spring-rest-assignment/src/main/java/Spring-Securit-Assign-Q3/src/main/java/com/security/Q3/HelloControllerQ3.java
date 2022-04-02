package com.security.Q3;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerQ3 {
	
	@GetMapping("/helloq3")
	public String sayHello() {
		return "Hello World Q3";
	}
}
	