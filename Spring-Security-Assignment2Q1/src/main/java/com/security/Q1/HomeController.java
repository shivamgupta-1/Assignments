package com.security.Q1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String all() {
		return "Hello All";
	}

	@GetMapping("/user")
	public String user() {
		return "Hello user";
	}

	@GetMapping("/admin")
	public String admin() {
		return "Hello admin";
	}
}
