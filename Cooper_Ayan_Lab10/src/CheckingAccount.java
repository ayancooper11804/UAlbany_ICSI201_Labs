
public class CheckingAccount extends BankAccount{
	private static double FEE = 0.15;
	private String accountNumber = getAccountNumber() + "-10";  
	
	public CheckingAccount (String name, double amount) {
		super(name, amount);
	    setAccountNumber(accountNumber);
	}
	
	public boolean withdraw (double amount) {
		double minus = amount + FEE;
	    super.withdraw(minus);

	    boolean done = true;
	    return done;
	}
}
