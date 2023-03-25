package Activity17;

import java.util.*;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account();
		System.out.println(account1.getAccountNumber());
		System.out.println(account1);
		
		Account[] accounts = new Account[5];
		for (Account account : accounts) {
			System.out.println(account);
		}
		System.out.println();
		
		Random random = new Random(2140);
		for (int i = 0; i < accounts.length; i++) {
			double initialBalance = random.nextDouble() * 1000000;
			accounts[i] = new Account(initialBalance);			
			System.out.println(accounts[i].getAccountNumber());
			System.out.printf("%.2f\n",initialBalance);
			System.out.println(accounts[i]);
		}
				
		System.out.println(Account.getNumAccount());
	}

}

