package Activity17;

import java.util.*;

public class AccountAndOwnerTest {

	public static void main(String[] args) {
		AccountOwner owner1 = new AccountOwner("900000001", "Alice");
		AccountOwner owner2 = new AccountOwner("900000002", "Bob");

		owner1.createAccount(1000);
		owner2.createAccount(2000);
		owner2.createAccount(3000);
		owner1.createAccount(4000);
		owner1.createAccount(5000);

		System.out.println(owner1);
		System.out.println(owner2);

		Random random = new Random(2140);

		for (Account account : owner1.getAccounts()) {
			double amount = random.nextDouble() * 100;
			owner1.deposit(account, amount);
		}
		
		for (Account account : owner2.getAccounts()) {
			double amount = random.nextDouble() * 100;
			owner1.deposit(account, amount);
		}
		
		for (Account account : owner2.getAccounts()) {
			double amount = random.nextDouble() * 100;
			owner2.withdraw(account, amount);
		}
		
		owner2.setName("Brian");
		Account account1 = owner1.getAccounts().get(0);
		owner2.withdraw(account1,1000);
		
		System.out.println(owner1);
		System.out.println(owner2);
		
	}

}
