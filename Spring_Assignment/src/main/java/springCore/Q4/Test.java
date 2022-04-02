
package springCore.Q4;

/*
 * 3) Example on autowiring
Design and Develop a Banking Application as follows:
a. Create a BankAccount class with following attributes: accountId,
accountHolderName, accountType, accountBalance
b. Create an interface BankAccountRepository with following methods:
public double getBalance(long accountId)
public double updateBalance(long accountId, double newBalance):
Note: Above method returns updated balance.
c. Create a class BankAccountepositoryImpl that implements
BankAccountRepository interface.
You can use database or any collection object as persistence store.
d. Create an interface BankAccountService with following methods:
public double withdraw(long accountId, double balance)
public double deposit(long accountId, double balance)
public double getBalance(long accountId)
public boolean fundTransfer(long fromAccount, long toAccount, double amont)
e. Create a class BankAccountServiceImpl that implements BankAccountService
interface.
f. Create a class BankAccount controller with following operations:
public double withdraw(long accountId, double balance)
public double deposit(long accountId, double balance)
public double getBalance(long accountId)
public boolean fundTransfer(long fromAccount, long toAccount, double amont)
g. Create a Test class with main() method, get BankAccountController bean object
from ApplicationContext and perform all the operations.
h. Also write the JUnit Test cases for above program.
- Use XML based configuration and perform autowiring with different types.
(byName, byType and constructor). Use one autowiring type at a time.

 */

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
