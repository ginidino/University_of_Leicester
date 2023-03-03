package Lab06;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private static double interestRate;
	private Date dateCreated;

	public Account() {
		
	}

	public Account(int id, double balance, double interestRate, Date dateCreated) {
		this.id = id;
		this.balance = balance;
		this.interestRate = 0;
		this.dateCreated = dateCreated;
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return this.interestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.interestRate = annualInterestRate;
	}

	public String getDateCreated() {
		return this.dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return this.interestRate / 12;
	}

	public double getMonthlyInterest() {
		return this.balance * (this.getMonthlyInterestRate() / 100);
	}

//	public void withdraw(double amount) {
//		this.balance -= amount;
//	}
//
//	public void deposit(double amount) {
//		this.balance += amount;
//	}
	
	@Override
	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + this.dateCreated + "\nBalance: £" + String.format("%.2f", this.balance) + "\nMonthly interest: £" + String.format("%.2f", this.getMonthlyInterest());
	}
}

class SavingsAccount extends Account {
    //private static final double MIN_BALANCE = 0.0;

	public SavingsAccount(int id, double balance, double interestRate, Date dateCreated) {
		super(id, balance, interestRate, dateCreated	);
	}

	public void withdraw(double amount) {
		if (amount < this.getBalance()) {
			this.setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error!");
	}
	
	public void deposit(double amount) {
		this.setBalance(this.getBalance() + amount);
	}
}

class CheckingAccount extends Account {
	private double overdraftLimit = -200;

	public CheckingAccount(int id, double balance, double interesteRate, Date dateCreated, double overdraftLimit) {
		super(id, balance, interesteRate, dateCreated);
		this.overdraftLimit = overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return this.overdraftLimit;
	}

	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error!");
	}
	
	public void deposit(double amount) {
		this.setBalance(this.getBalance() + amount);
	}
	
//	@Override
//	public String toString() {
//		return super.toString() + "\nOverdraft limit: £" + String.format("%.2f", this.overdraftLimit);
//	}
}
