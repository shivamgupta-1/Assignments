package Q4;

import java.util.Scanner;

public class assignment1Q4 {

	public static void main(String[] args) {
		ResultDeclaration r=new ResultDeclaration();
		System.out.println("enter the value");
		Scanner s=new Scanner(System.in);
		double M1= s.nextInt();
		double M2= s.nextInt();
		double M3= s.nextInt();
		String result= r.declareResults(M1, M2, M3);
		System.out.println("result is"+result);
		s.close();

	}

}
