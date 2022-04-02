package springCore.Q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

@Controller("controller")
public class BankAccountController {

	@Autowired
	ApplicationContext context;


	public double withdraw(long accountId, double balanceToBeWithdraw) {
		double newBalance = 0;
		BankAccountRepositoryImpl acc = (BankAccountRepositoryImpl) context.getBean("service");
		if (acc.getBalance(accountId) >= balanceToBeWithdraw)
			newBalance = acc.getBalance(accountId) - balanceToBeWithdraw;
		acc.updateBalance(accountId, newBalance);
		return newBalance;
	}

	public double deposit(long accountId, double balance) {
		BankAccountRepositoryImpl acc = (BankAccountRepositoryImpl) context.getBean("service");
		double Newbalance = acc.getBalance(accountId) + balance;
		return acc.updateBalance(accountId, Newbalance);

	}

	public double getBalance(long accountId) {

		BankAccountRepositoryImpl balance = (BankAccountRepositoryImpl) context.getBean("service");
		return balance.getBalance(accountId);

	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		BankAccountRepositoryImpl accountepository = (BankAccountRepositoryImpl) context.getBean("service");
		if (accountepository.getBalance(fromAccount) >= amont) {
			double updatedAmt = amont + accountepository.getBalance(toAccount);

			// updating both the accounts
			accountepository.updateBalance(fromAccount, accountepository.getBalance(fromAccount) - amont);
			accountepository.updateBalance(toAccount, updatedAmt);
			return true;
		}
		return false;
	}
}
