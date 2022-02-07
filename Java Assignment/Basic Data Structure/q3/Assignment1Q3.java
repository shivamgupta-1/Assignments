package q3;

import java.util.Scanner;

public class Assignment1Q3 {

	
	public static void main(String[] args) {
		SiCi result=new SiCi();
		System.out.println("Enter the value");
		Scanner sc = new Scanner(System.in);
			double p=(double) sc.nextInt();
			double r=sc.nextInt();
			int t=(int) sc.nextInt();
			  double simpleInterest= result.simpleInterest(p,r,t);
			  double compoundInterest= result.compoundInterest(p,r,t);
			System.out.println("simple Interest is"+simpleInterest);
			System.out.println("compound interest is"+compoundInterest);
			sc.close();
		}
		
		

	}


