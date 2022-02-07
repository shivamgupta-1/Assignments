package StringAssignment;

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
