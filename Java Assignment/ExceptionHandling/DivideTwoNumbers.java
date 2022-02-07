package ExceptionHandling;

import java.util.Scanner;

public class DivideTwoNumbers {
	private int num1,num2;
	public int DivideTwoNumbers(int num1, int num2) {
		int c = 0;
		try {
			c = num1/num2;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return c;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		DivideTwoNumbers n1=new DivideTwoNumbers();
		System.out.println(n1.DivideTwoNumbers(num1, num2));
		sc.close();
	}

}
