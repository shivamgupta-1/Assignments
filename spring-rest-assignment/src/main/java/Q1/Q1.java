package Q1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Q1 {

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World";
	}
}
