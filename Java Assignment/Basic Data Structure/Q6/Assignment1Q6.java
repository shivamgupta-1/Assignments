package Q6;

import java.util.Scanner;

public class Assignment1Q6 {

	

	public static void main(String[] args) {
		Login user1= new Login();
		Scanner s=new Scanner(System.in);
		String a;
		while(user1.count<=2) {
			System.out.println("Enter userid");
			String user=s.next();
			System.out.println("Enter the password");
			String pass=s.next();
			a=user1.loginUser(user, pass);
			if(!(a.equals("false"))){
				System.out.println(a);
				break;
			}
			else {
				if(user1.count==0) {
					System.out.println("You have entered wrong credentials, enter again");
					user1.count++;
				}
				else if(user1.count==1) {
					System.out.println("You have entered wrong credentials, enter again");
					user1.count++;
				}
				else if(user1.count==2) {
					System.out.println("You have entered wrong credentials 3 times");
					System.out.println("Contact Admin");
					break;
				}
			}
		}
		
		
		
		
		

		
		

	}
	

}
