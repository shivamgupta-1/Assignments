package Q5;

import java.util.Scanner;

public class Assignment1Q5 {

	public static void main(String[] args) {
		TaxAmount tax= new TaxAmount();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the ctc");
		int ctc=s.nextInt();
		int ans=(int) tax.calculateTaxAmount(ctc);
		System.out.println("Payable Tax is "+ans+"%");
		s.close();
	}

}
