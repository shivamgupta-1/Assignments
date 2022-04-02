package Q2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
 * Create a RESTful web service that authenticates an user. User will specify his/her credentials i.e.
username and password. If username and password are correct, It should return "valid user"
message, else "Invalid user" message.
 */


@RestController
public class validUserController {

	@GetMapping("/{username}/{password}")
	public String userCheck(@PathVariable("username") String username, @PathVariable("password") String password) {

		IsUserValid isUserValid = new IsUserValid();
		if (isUserValid.check(username, password)) {
			return "valid user";
		} else {
			return "invalid user";
		}

	}
	
	
}
