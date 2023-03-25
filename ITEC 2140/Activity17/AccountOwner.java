package Activity17;

import java.util.*;

public class AccountOwner {
	private String id;
	private String name;
	private ArrayList<Account> accounts = new ArrayList<>();
	
	public AccountOwner(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getID() {
		return id;
	}

	public String getname() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	
	public void createAccount(double initialBalance) {
		Account acount = new Account(this, initialBalance);
		accounts.add(acount);		
	}
	
	public boolean equals(AccountOwner owner) {
		return id == owner.id;
	}
	
	public void deposit(Account account, double amount) {
		account.deposit(amount);
	}
	
	public void withdraw(Account account, double amount) {
		if ( ! this.equals(account.getOwner())) {
			System.out.println("Withdrawal denied: You are not the owner of the account");
			return;
		}
		
		account.withdraw(amount);
	}
	
	public double totalBalance() {
		double total = 0;
		for (Account account : accounts) {
			total += account.getBalance();
		}
		return total;
	} 
	
	public String toString() {
		String str = "Name: " + name + "\n";
		str += 	"ID: " + id + "\n\n";
		
		for (Account account : accounts) {
			str += account.toString() + "\n";
		}
		str += String.format("Total Balance: %.2f\n",totalBalance());
		return str;
	}
}
