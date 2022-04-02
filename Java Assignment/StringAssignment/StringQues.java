package StringAssignment;

/*
 * 3) Given a String “Java String pool refers to collection of Strings which are stored in heap
memory”, perform the following operations (Hint: all operation can be performed using
String methods)
a. Print the string to console in lowercase
b. Print the string to console in uppercase
c. Replace all ‘a’ character in the string with $ sign
d. Check if the original String contains the word “collection”
e. Check if the following String “java string pool refers to collection of strings which
are stored in heap memory” matches the original
f. If the string does not match check if there is another method which can be used to
check if the strings are equal 
 */
public class StringQues {

	public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace("a","$"));
		System.out.println(str.contains("collection"));
		
		String str2="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(str2.equals(str));
		System.out.println(str2.equalsIgnoreCase(str));
	}

}
