package Q5;

public class TaxAmount {
	public double calculateTaxAmount(int ctc) {
	if(ctc<=180000) {
		return 0;
	}
	 else if((ctc>=181001) && (ctc<=300000)) {
		
		return 10;
	}
	 else if((ctc>=300001) && (ctc<=500000)) {
		return 20;
	}
	else {
		return 30;
	}
	}

	}


