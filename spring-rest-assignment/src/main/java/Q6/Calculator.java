package Q6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

	@GetMapping("/add/query")
	public int add(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
		return num1 + num2;

	}

	@GetMapping("/sub")
	public int sub(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
		return num1 - num2;

	}

	@GetMapping("/mul")
	public int mul(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
		return num1 * num2;

	}

	@GetMapping("/div")
	public int div(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2) {
		return num1 / num2;

	}

	@GetMapping("/sqroot")
	public int sqRoot(@RequestParam(name = "num1") int num1) {
		return (int) Math.sqrt(num1);

	}
}
