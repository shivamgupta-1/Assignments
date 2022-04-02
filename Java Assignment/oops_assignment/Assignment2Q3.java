package oops_assignment;

import java.util.ArrayList;

/*
 *Q3. Write a program to consider saving & current account in the bank. Saving account holder has ‘Fixed Deposits’ whereas Current account holder has cash credit. Apply polymorphism to find out total cash in the bank.

Description:-

Write a program to claculate the total cash available in the bank. In this bank,bank will provide two types of accounts one is savings accounts and another is current account where current account has cash credits and savings account has fixed deposit options.
 */

class CurrentAccount extends Assignment2Q3 {
	int totalDeposits = 10000;
	int creditLimit = 2000;

	@Override
	public int getCash() {
		return totalDeposits - creditLimit;
	}
}

class SavingsAccount extends Assignment2Q3 {
	int totalDeposits = 10000;
	int fixedDepositAmount = 5000;

	@Override
	public int getCash() {
		return fixedDepositAmount + totalDeposits;
	}
}
public class Assignment2Q3 {
	public int totalCashInBank(ArrayList<Integer> cash) {
		int totalCash = 0;
		for (Integer c : cash) {
			totalCash += c;
		}
		return totalCash;
	}

	public int getCash() {
		return 0;

	}
	public static void main(String[] args) {

		Assignment2Q3 acc = new Assignment2Q3();

		Assignment2Q3 currentAccount1 = new CurrentAccount();
		Assignment2Q3 savingAccount1 = new SavingsAccount();

		int savingAccCash = savingAccount1.getCash();
		int currentAccCash = currentAccount1.getCash();

		ArrayList<Integer> cash = new ArrayList<Integer>();
		cash.add(savingAccCash);
		cash.add(currentAccCash);
		System.out.println(acc.totalCashInBank(cash));
	}

}
