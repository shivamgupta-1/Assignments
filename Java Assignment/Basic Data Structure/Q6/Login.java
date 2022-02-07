package Q6;

class Login {
static String userId="Ajay";
static String password="password";
int count=0;
public static String loginUser(String user,String pass) {
	if((user.compareTo(userId)==0)&&(pass.compareTo(password)==0)){
		return "welcome "+userId;
		
	}
	else {
		return "false";
	}
}
}

