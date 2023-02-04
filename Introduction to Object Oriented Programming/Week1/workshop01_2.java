package Lab01;

import java.util.Scanner;

public class workshop01_2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		double num1 = Double.parseDouble(reader.nextLine());
		
		System.out.print("Enter the second number: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		double k = num2 % num1;
		
		if (k == 0) {
			System.out.println(num1 + "is a multiple of " + num2);
		} else {
			System.out.println(num1 + "is not a multiple of " + num2);
		}
	}
}
