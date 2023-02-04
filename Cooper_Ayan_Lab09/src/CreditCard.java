/**
 * This class represents the aspects of a credit card.
 * @author student Ayan Cooper, Class of 2026, State University of New York University at Albany
 *
 */
public class CreditCard {
	private Money balance;
	private Money creditLimit;
	private Person owner;
	
	/**
	 * CreditCard: The constructor method
	 * @param newCardHolder Owner of the credit card
	 * @param limit The limit on the credit card
	 */
	public CreditCard(Person newCardHolder, Money limit) {
		owner = newCardHolder;
		creditLimit = new Money(limit);
		balance = new Money(0);
	}
	/**
	 * The getBalance method
	 * @return The balance on the credit card
	 */
	public Money getBalance() {
		return new Money(balance);
	}
	
	/**
	 * The getCreditLimit method
	 * @return The limit on the credit card
	 */
	public Money getCreditLimit() {
		return new Money(creditLimit);
	}
	
	/**
	 * The getPersonals method
	 * @return The information about the owner
	 */
	public String getPersonals() {
		return owner.toString();
	}
	/**
	 * The charge method adds money to the credit card, unless the amount exceeds the limit
	 * @param amount The amount of money added to the credit card
	 */
	public void charge(Money amount) {
		Money amountCharged = amount;
		if (balance.add(amount).compareTo(creditLimit) <= 0) {
			balance = balance.add(amount);
			System.out.println("Charge: " + amountCharged);
		}
		else {
			System.out.println("ERROR: The Credit Limit has been exceeded.");
		}
	}
	
	/**
	 * The payment method subtracts money from the credit card
	 * @param amount The amount of money subtracted from the credit card
	 */
	public void payment(Money amount) {
		balance = balance.subtract(amount);
	}
}
