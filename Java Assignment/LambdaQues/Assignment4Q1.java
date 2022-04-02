package LambdaQues;
/*
 * 1. Write an application to perform basic arithmetic operations like add, subtract, multiply & divide. You need to define a functional interface first.

Description:-

Define Functional Interface and write a program to perform arithmetic operations like add, subtract, multiply and divide using functional interface.

Examples:

              Input:-          13       5

              Output:-

                                      18.0      //Addition of 13 and 5

                                       8.0        //Subtraction of 13 and 5

                                       65.0      // Multiplication of 13 and 5  

                                       2.6        //Division of 13 and 5
 */

public class Assignment4Q1 {
	interface Add{
	public  double addition(int num1,int num2);
	}
	interface Sub{
	public double subtraction(int num1,int num2);
	}
	interface Multiply{
	public double multiplication(int num1,int num2);
	}
	interface Div{
	public double division(int num1,int num2);
	}
	

	public static void main(String[] args) {
		Add a1= (num1,num2)->(num1+num2);
		System.out.println("Addition is:"+a1.addition(13, 5));
		
		Sub sub=(num1,num2)->(num1-num2);
		System.out.println("Subtraction is :"+sub.subtraction(13,5));
		Multiply mul=(num1,num2)->(num1*num2);
		System.out.println("Multiplication is: "+mul.multiplication(18,5));
		Div div=(num1,num2)->(num1/num2);
		System.out.println("Division is: "+div.division(18, 5));
	
	}
}

