package LambdaQues;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
 * Remove the words that have odd lengths from the list. HINT: Use one of the new methods from JDK 8. Use removeIf() method from Collection interface.

Description:-

Write a program using java 8 features which can remove the odd length words from the list.
 */

public class Assignment4Q4 {
	public ArrayList<String> removeOddLength(ArrayList<String> employeeList) {

		Predicate<String> charcount = p -> p.length() % 2 != 0;
			employeeList.removeIf(charcount);


		return employeeList;
	}
	public static void main(String[] args) {

		Assignment4Q4 arr = new Assignment4Q4();

		ArrayList<String> empolyeeList = new ArrayList<String>();
		empolyeeList.add("shivam");
		empolyeeList.add("anuj");
		empolyeeList.add("prabh");
		empolyeeList.add("gaurav");
		empolyeeList.add("gaurav2");

		for (String newArr : arr.removeOddLength(empolyeeList))

		System.out.println(newArr);

	}

}
