package Lab01;

import java.util.Scanner;

public class workshop01_4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int num1 = Integer.parseInt(reader.nextLine());
		// int num1 = reader.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " is less than " + num2);
		} else {
			System.out.println("These numbers are equal.");
		}
	}
}
