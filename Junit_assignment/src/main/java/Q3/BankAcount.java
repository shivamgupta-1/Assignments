package Q3;


public class BankAcount {
	private long id;
	private double balance = 2000;

	public void withdraw(double amount) throws InsuffientBalanceException {

		if (balance < amount || balance == 0) {
			throw new InsuffientBalanceException("Insufficient balance");

		} else {
			balance -= amount;
			System.out.println("You can withdraw " + amount);
		}

	}
}
