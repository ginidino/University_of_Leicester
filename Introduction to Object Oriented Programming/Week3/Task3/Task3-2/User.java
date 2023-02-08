package Lab03;

public class User {
	private String accountNum;
	private double balance;
	
	public String getAccountNum() {
		return this.accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public void withdraw(int amount) {
		this.balance -= amount;
	}
	
	public void introduce() {
		System.out.println("Account number is: " + this.accountNum + "\n" + "Balance is: " + this.balance);
	}
}
