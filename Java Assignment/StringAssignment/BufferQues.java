package StringAssignment;

/*
 * 1) Write an application to append the following strings “StringBuffer”, “is a peer class of
String”, “that provides much of “, “the functionality of strings” using a StringBuffer.
2) Insert the following string “insert text” into the string “It is used to _ at the specified index
position” at the location denoted by the sign _
3) Reverse the following string “This method returns the reversed object on which it was
called” using StringBuffer Class

 */
public class BufferQues {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		str.append("StringBuffer");
		str.append(" is a peer class of String");
		str.append(" that provide much of");
		str.append(" the functionality of strings");
		System.out.println(str);
		
		StringBuffer str1=new StringBuffer();
			str1.append("It is used to _ at the specified index position");
			str1.replace(14, 15, "insert text");
			System.out.println(str1);
			
			StringBuffer str2=new StringBuffer();
			str2.append("This method returns the reversed object on which it was called");
			System.out.println(str2.reverse());
			
		

	}

}
