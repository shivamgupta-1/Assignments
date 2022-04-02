package springCore.Q4;

import org.springframework.beans.factory.annotation.Autowired;

public class BankAccountRepositoryImpl implements BankAccountRepository{

	@Autowired
	private BankAccount bankAccount1;
	@Autowired
	private BankAccount bankAccount2;

	public BankAccountRepositoryImpl(BankAccount bankAccount1, BankAccount bankAccount2) {
		super();
		this.bankAccount1 = bankAccount1;
		this.bankAccount2 = bankAccount2;
	}

	public double getBalance(long accountId) {
		

		if (this.bankAccount1.getAccountId() == accountId) {
			return bankAccount1.getAccountBalance();
		} else {
			return bankAccount2.getAccountBalance();
		}

	}

	public double updateBalance(long accountId, double newBalance) {

		if (this.bankAccount1.getAccountId() == accountId) {

			bankAccount1.setAccountBalance(newBalance);
			return newBalance;

		} else {

			bankAccount2.setAccountBalance(newBalance);
			return newBalance;
		}
	}

}
