package ExceptionHandling;

public class IllegalBankTransactionException extends Exception {
  public IllegalBankTransactionException(String str) {
	  super(str);
  }
}
