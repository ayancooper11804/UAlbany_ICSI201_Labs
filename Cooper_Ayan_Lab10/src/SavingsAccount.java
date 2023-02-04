
public class SavingsAccount extends BankAccount{
	double rate = 0.25;
	static int savingsNumber = 0;
	private String accountNumber = super.getAccountNumber();
	
	public SavingsAccount (String name, double amount) {
		super(name, amount);
		accountNumber = accountNumber + "-" + Integer.toString(savingsNumber);
	}
	
	public SavingsAccount (SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingsNumber++;
		accountNumber = oldAccount.accountNumber + Integer.toString(savingsNumber);
	}
	
	public void postInterest () {
		double interest = getBalance() * 0.025/12;
		double afterInterest = getBalance() + interest;
		setBalance(afterInterest);
	}
	
	public String getAccountNumber () {
		return accountNumber;
	}
}
