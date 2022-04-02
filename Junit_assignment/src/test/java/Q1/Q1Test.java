package Q1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Q1.Q1.MinMaxFinder;

class Q1Test {
	MinMaxFinder minMaxFinder;
	@BeforeEach
	void main() {
		minMaxFinder = new MinMaxFinder();
	}

	@Test
	@DisplayName("Testing with positive integer array")
	void testMinMaxFinder() {
		

		int arr[] = { 2, 1, 5, 8 };
		int expected[] = { 1, 8 };
		int actual[] = minMaxFinder.findMinMax(arr);
		assertArrayEquals(expected, actual);
		
	}

	@Test
	@DisplayName("Testing with negative integer array")
	void testMinMaxFinder2() {

		int arr[] = { -2, -1, -5, -8 };
		int expected[] = { -8, -1 };
		int actual[] = minMaxFinder.findMinMax(arr);
		assertArrayEquals(expected, actual);

	}
	@Test
	@DisplayName("Testing with only 1 element in array")
	void testMinMaxFinder3() {

		int arr[] = { 8 };
		int expected[] = { 8, 8 };
		int actual[] = minMaxFinder.findMinMax(arr);
		assertArrayEquals(expected, actual);

	}

}
