package Q2;

import org.springframework.stereotype.Service;

@Service
public class IsUserValid {
	private String UserName = "shivam";
	private String Password = "abc@123";

	public boolean check(String username, String password) {

		if (username.equals(UserName) && password.equals(Password)) {

			return true;
		} else {
			return false;
		}

	}

}
