package LambdaQues;

import java.util.Arrays;
import java.util.List;

/*
 * Q5. Create a string that consists of the first letter of each word in the list of Strings provided. HINT: Use Consumer interface & a String Builder to construct the result.

Description:

Write a java program using StringBuilder and Consumer interface which will return a string. The returned string should consistes of the first let of each word in the list of words.
 */
public class Assignment4Q5 {


	public static void main(String[] args) {
		List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
		System.out.println(processWords(list));

	}

	public static String processWords(List<String> list) {
		StringBuilder builder = new StringBuilder();
		list.forEach(p -> builder.append(p.charAt(0)));
		return builder.toString();
	}

}
