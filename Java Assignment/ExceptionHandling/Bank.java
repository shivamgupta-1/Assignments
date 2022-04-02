package ExceptionHandling;

/*
 * 3) Write an application to perform withdraw functionality on a SavingAccount object. Point to
note:
a. Raise InsufficientBalanceException if you are trying to withdraw more than balance
or when you balance is zero. E.g. if you balance is 2000 and if you are trying to
withdraw 2100 or if you balance is 0 and you are trying to withdraw positive value.
b. Raise IllegalBankTransactionException if you are trying to withdraw a negative value
from your balance. E.g. if you try to withdraw a negative value savingAcc.withdraw(-
1000); 
 */
import java.util.Scanner;

public class Bank {
	
	private long id;
	private double balance=2000;
	public void withdraw(double amount) throws InsuffientBalanceException, IllegalBankTransactionException {
		if(amount<0) {
			
			throw new IllegalBankTransactionException("Your amount is invalid");
			
		}
		else if(balance<amount ||balance==0) {
			throw new InsuffientBalanceException("Insufficient balance");
			
			
		}
		else  {
			balance -=amount;
			System.out.println("You can withdraw "+amount);
		}
	
	}
	void deposit(double amount) {
		balance+=amount;
		System.out.println(amount +" added to your balance");
	}

	public static void main(String[] args) throws InsuffientBalanceException, IllegalBankTransactionException {
		Bank savingAcc=new Bank();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		double amount=sc.nextDouble();
		savingAcc.withdraw(amount);
	}

}
