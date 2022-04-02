package LambdaQues;

import java.util.Arrays;
import java.util.List;

/*
 * Q8. Create a new thread that prints the numbers from the list. Use class Thread & interface Consumer.

Description:-

Write a java program which will print the list of number using Thread and interface Consumer.
 */
public class Assignment4Q8 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 34, 5);

		Thread td = new Thread(() -> list.forEach(p -> System.out.println(list)));

		td.run();

	}

}
