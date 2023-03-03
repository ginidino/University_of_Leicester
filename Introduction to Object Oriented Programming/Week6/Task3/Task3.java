package Lab06;

import java.util.Date;

public class Task3 {
	public static void main(String[] args) {
		Account account = new Account(1122, 200, 1.2, new Date());
		System.out.println(account + "\n");
		SavingsAccount savings = new SavingsAccount(1001, 200, 1.2, new Date());
		CheckingAccount checking = new CheckingAccount(1004, 2000, 1.2, new Date(), -20);

		//account.withdraw(2500);
		//savings.withdraw(2500);
		checking.withdraw(2500);
		checking.withdraw(10);

		//account.deposit(3000);
		//savings.deposit(3000);
		checking.deposit(3000);

		System.out.println(account + "\n");
		System.out.println(savings + "\n");
		System.out.println(checking);
    }
}
