 
public class Account {
	private static int account_count = 1;
	private double balance;
	private int id;
	
	public Account() {
		this.id = Account.account_count;
		Account.account_count++;
	}
	
	public Account(double startingBalance) throws IllegalArgumentException{
		this();
		this.balance = startingBalance;
		if(startingBalance < 0) {
			throw new IllegalArgumentException("An account's starting balance must be nonnegative.");
		}
	}

	public boolean withdraw(double amount) {
		if(amount <= this.balance) {
			this.balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getBalance() {
		return this.balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public int getId() {
		return this.id;
	}
	
}
