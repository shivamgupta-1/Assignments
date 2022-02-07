package ExceptionHandling;

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
