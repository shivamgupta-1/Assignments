
package springCore.Q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("q3.xml");
		BankAccountController bankController = (BankAccountController) context.getBean("bankController");

		System.out.println(bankController.deposit(1001, 1000));
		System.out.println(bankController.withdraw(1002, 500));
		System.out.println(bankController.getBalance(1001));
		System.out.println(bankController.fundTransfer(1001, 1002, 2000));

	}

}
