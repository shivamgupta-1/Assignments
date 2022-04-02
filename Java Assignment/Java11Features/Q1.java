package Java11Features;
//Write a program to calculate the Simple Interest with minimal code using features of
//Java 11. 

@FunctionalInterface
interface SimpleInterest{
	int si(int principal,int rate,int time);
}

public class Q1 {
	

	public static void main(String[] args) {
	
		SimpleInterest simpleInterest=(var principal,var rate,var time) -> (principal*rate*time )/100;
		System.out.println(simpleInterest.si(50,10,5)); 
	
	}

	
	}







