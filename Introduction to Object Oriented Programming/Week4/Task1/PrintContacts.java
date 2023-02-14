package Lab04;

import java.util.Scanner;

public class PrintContacts {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Contact contact = new Contact();
		
		while (true) {
			System.out.print("Enter the name: ");
			String name = reader.nextLine();
			
			if (name.isEmpty()) {
				break;
			}
			
//			System.out.print("Enter the address number: ");
//			int addNum = Integer.parseInt(reader.nextLine());
			
			System.out.print("Enter the address: ");
			String add = reader.nextLine();
			
			System.out.print("Enter the phone number: ");
			String num = reader.nextLine();
			//System.out.println();
			
			//contact = new Contact(name, num);
			
			//contact.printDetails();
			//System.out.println();
			
			contact = new Contact(name, add, num);
			System.out.println("Contacts List\n");
			contact.printDetails();
			
			System.out.println();
		}
		
	}
}
