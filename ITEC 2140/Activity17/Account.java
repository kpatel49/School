package Activity17;

public class Account {
	
	private static int numAccounts;
	private int accountNumber;
	private double balance;
	private AccountOwner owner;

	public Account(AccountOwner owner, double initialBalance) {
		accountNumber = ++numAccounts;
		balance = initialBalance;
		this.owner = owner;
	}

	public Account(AccountOwner owner) {
		accountNumber = ++numAccounts;	
		this.owner = owner;
	}
	
	public AccountOwner getOwner() {
		return owner;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Withdrawal denied: Amount to withdraw cannot exceed the balance");
			return;
		}
		balance -= amount;
	}
	
	public String toString() {
		String str = "Account Number: " + accountNumber + "\n";
		str += String.format("Balance: %.2f\n",balance);		
		return str;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public static int getNumAccount() {
		return numAccounts;
	}
}
