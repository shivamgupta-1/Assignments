package springCore.Q3;

public class BankAccountServiceImpl implements BankAccountService{
	
	
	private BankAccount bankAccount1;
	private BankAccount bankAccount2;

	public BankAccountServiceImpl() {
	}

	public double withdraw(long accountId, double balance) {
		
		if(this.bankAccount1.getAccountId()==accountId) {
		      if(bankAccount1.getAccountBalance()< balance ||bankAccount1.getAccountBalance()== 0) {
		    	  
		    	  return 0;
		      }
		      else {
		    	  double remainingAmt = bankAccount1.getAccountBalance()- balance;
		    	  return remainingAmt;
		      }
		}
		else {
			if(bankAccount1.getAccountBalance()< balance ||bankAccount1.getAccountBalance()== 0) {
		    	  
		    	  return 0;
		      }
		      else {
		    	  double remainingAmt = bankAccount1.getAccountBalance()- balance;
		    	  return remainingAmt;
		      }
		}
	}
		


	public double deposit(long accountId, double balance) {
		
		if(this.bankAccount1.getAccountId()==accountId) {
			double newBalance = bankAccount1.getAccountBalance()+balance;
			bankAccount1.setAccountBalance(newBalance);
			return newBalance;
		}
		else {
			double newBalance = bankAccount2.getAccountBalance()+balance;
			bankAccount2.setAccountBalance(newBalance);
			return newBalance;
		}
	
	}

	public double getBalance(long accountId) {
		if(this.bankAccount1.getAccountId()==accountId) {
			return bankAccount1.getAccountBalance();
		}
		else {
			return bankAccount2.getAccountBalance();

		}
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {

		if(this.bankAccount1.getAccountId()==fromAccount) {
			
			if(bankAccount1.getAccountBalance()< amont ||bankAccount1.getAccountBalance()== 0) {
				return false;
			}
			else {
				double updateAmt= bankAccount2.getAccountBalance() + amont;
				double decreaseAmt= bankAccount1.getAccountBalance() - amont;
				
				bankAccount2.setAccountBalance(updateAmt);
				bankAccount1.setAccountBalance(decreaseAmt);
				return true;
			}
		}
		else {
			if(bankAccount2.getAccountBalance()< amont ||bankAccount2.getAccountBalance()== 0) {
				return false;
			}
			else {
				double updateAmt= bankAccount1.getAccountBalance() + amont;
				double decreaseAmt= bankAccount2.getAccountBalance() - amont;
				
				bankAccount1.setAccountBalance(updateAmt);
				bankAccount2.setAccountBalance(decreaseAmt);
				return true;
		}
		
	

	}

	}
}

