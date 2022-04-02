package Q4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	static Calculator calculator;

	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All printed");
		calculator = new Calculator();
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each printed");

	}

	@AfterEach
	void afterEach() {
		System.out.println("After Each printed");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("After all printed");
	}
	@Test
	void add() {
		System.out.println("In add test");
		assertEquals(6, calculator.add(4, 2));
	}

	@Test
	void subtract() {
		System.out.println("In subtract test");
		assertEquals(2, calculator.Subtract(4, 2));
	}

	@Test
	void multiply() {
		System.out.println("In multiply test");
		assertEquals(8, calculator.multiply(4, 2));
	}

}
