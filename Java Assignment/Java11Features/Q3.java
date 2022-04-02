package Java11Features;
/*
 * 3. “A quick brown fox jumps over the lazy dog”. Create an ArrayList from the given
String. Such an ArrayList should include each word from the given sentence. Finally
convert such List to an array using Java 11 methods and print the output. 
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		String str="A quick brown fox jumps over the lazy dog";
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(str.split(" ")));
		String [] arrayStr=list.stream().toArray(size->new String[size]);
		System.out.println(Arrays.toString(arrayStr));
	}

}
