package Q1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String web() {
		return "Hello web";
	}

	@GetMapping("/admin")
	public String helloWorld() {
		return ("<h1>Hello Admin</h1>");
	}

}
