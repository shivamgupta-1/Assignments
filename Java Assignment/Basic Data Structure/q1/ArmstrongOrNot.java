
public class ArmstrongOrNot {
	public boolean armstrongCheck(int num) {
		int leng=0;
		int v1=num;
		int t1=num;
		double total=0;
		while(v1>0) {
			v1=v1/10;
			leng++;
		}
		int rem;
		while(t1!=0) {
			rem=t1%10;
			total=total+ (Math.pow(rem,leng));
			t1=t1/10;
			
		}
		if(total==num) {
			return true;
		}
		else {
			return false;
		}
			

		
	}
}

