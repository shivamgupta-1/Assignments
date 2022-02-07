package Q4;

public class ResultDeclaration {
	public boolean checkG60(double num) {
		if(num>60) {
			return true;
		}
		else {
			return false;
		}
	}

	public String declareResults(double subject1Marks,double subject2Marks,double subject3Marks) {
	
		double a =subject1Marks;
		double b =subject2Marks;
		double c =subject3Marks;
		
		boolean d =checkG60(a);
		boolean e= checkG60(b);
		boolean f= checkG60(c);
		if(d&&e&&f) {
			return "passed";
		}
		else if(d&&e || e&&f || d&&f) {
			return "promoted";
			
		}
		else {
		return "failed";
		}
		
		
		
	}
}
	

