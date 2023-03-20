package Lab08;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while (true) {
		      try {
		        System.out.print("Enter customer ID: ");
		        String customerID = reader.nextLine();
		        if (!customerID.matches("[A-Za-z]\\d{3}")) {
		          throw new Exception("Customer ID must start with a letter and should be followed by three digits.");
		        }

		        System.out.print("Enter account number: ");
		        String accountNumber = reader.nextLine();
		        if (accountNumber.length() != 5) {
		          throw new Exception("Account number must be of five digits.");
		        }

		        System.out.print("Enter initial balance: ");
		        double balance = Double.parseDouble(reader.nextLine());
		        if (balance < 1000.00) {
		          throw new Exception("Initial balance must be above $1000.");
		        }
		        System.out.println();
		        System.out.print("Data entered successfully.");
		        System.out.println("Customer ID: " + customerID);
		        System.out.println("Account Number: " + accountNumber);
		        System.out.println("initial balance: " + balance);
		        break;
		      } catch (Exception e) {
		        System.out.println(e.getMessage());
		      }
		}
	}
}