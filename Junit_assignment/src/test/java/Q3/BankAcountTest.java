package Q3;

import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

class BankAcountTest {

	@Test
	void test() {
		BankAcount bankAcount = new BankAcount();
		assertThrows(InsuffientBalanceException.class, () -> bankAcount.withdraw(20000));
	}

}
