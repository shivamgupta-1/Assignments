package LambdaQues;

import java.util.Arrays;
import java.util.List;

public class Assignment4Q6 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("shivam", "Anuj", "AshIsh");
		Assignment4Q6 test = new Assignment4Q6();
		System.out.println(test.convertToUpperCase(list));
	}

	public List<String> convertToUpperCase(List<String> list) {
		list.replaceAll(e -> e.toUpperCase());
		return list;

	}
}

