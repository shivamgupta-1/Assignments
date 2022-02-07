package ExceptionHandling;

public class InsuffientBalanceException extends Exception{
	public InsuffientBalanceException(String str){
		super(str);
	}
}