package q3;

public class SiCi {
public double simpleInterest(double principalAmount,double time,double interestRate) {
	double si = (principalAmount*time*interestRate)/100;
	return si;
}
public double compoundInterest(double principalAmount,double time,double interestRate) {
	double ci;
	double r= 1+ (interestRate/100);
	ci= principalAmount*((Math.pow(r, time))-1);
	return ci;
	
}

}

