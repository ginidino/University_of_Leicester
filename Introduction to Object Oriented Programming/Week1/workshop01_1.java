package Lab01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class workshop01_1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter some text: ");
		String text = reader.nextLine();
		System.out.print("How many times: ");
		try {
			int count = Integer.parseInt(reader.nextLine());
			for (int i = 0; i < count; i++) {
				System.out.println((i + 1) + " " + text);
			}
		} catch (InputMismatchException e) {
			System.err.println("Error: Must be a number.");
			System.exit(1);
		}
	}
}
