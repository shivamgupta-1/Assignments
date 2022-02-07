
public class Assignment1Q1 {

	public static void main(String[] args) {
		
		ArmstrongOrNot a =new ArmstrongOrNot();
		int num=371;
		boolean result=a.armstrongCheck(371);
		if(result==true) {
			System.out.println( num +" is  an armstrong");
		}
		else {
			System.out.println("It is not");
		}
		
		

	}

}
