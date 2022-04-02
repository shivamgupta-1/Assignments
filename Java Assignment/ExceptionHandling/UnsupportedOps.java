package ExceptionHandling;

/*
 * 2) Carrying forward with the above problem, handle ArithmeticException by raising
UnsupportedOperationException as a solution. 

 */
import java.util.Scanner;

public class UnsupportedOps {
		private int num1,num2;
		public int DivideTwoNumbers(int num1, int num2) {
			int c = 0;
			try {
				if(num2==0) {
					throw new UnsupportedOperationException();
				}
				c = num1/num2;
			} catch (UnsupportedOperationException e) {
				System.out.println("can't divide by zero");
			}
			return c;
			
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		UnsupportedOps n1=new UnsupportedOps();
		System.out.println(n1.DivideTwoNumbers(num1, num2));
		System.out.println("enter new number");
		int d=sc.nextInt();
		System.out.println(num1/d);
		sc.close();
	}

}
