package LambdaQues;

/*
 * Q7. Convert every key-value pair of the map into a string and append them all into a single string, in iteration order. HINT: Use Map.entrySet() method & a StringBuilder to construct the result String.

Description:-

Write a java program using Map.entrySet() method & a StringBuilder which will return a string by appending all the key value pairs of a map into a single string ,in insertion order
 */
import java.util.HashMap;

public class Assignment4Q7 {

	public static void main(String[] args) {
		Assignment4Q7 string = new Assignment4Q7();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("shivam", 1);
		map.put("anuj", 2);
		map.put("shreyash", 3);
		map.put("ashish", 4);

		System.out.println(string.convertKeyValueToString(map));

	}

	public String convertKeyValueToString(HashMap<String, Integer> map) {
		StringBuilder builder = new StringBuilder();
		map.entrySet().forEach(p -> builder.append(p.getKey()).append(p.getValue()));
		return builder.toString();

	}

}
