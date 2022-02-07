package StringAssignment;

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
