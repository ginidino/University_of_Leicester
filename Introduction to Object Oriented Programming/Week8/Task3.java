package Lab08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = Integer.parseInt(reader.nextLine());
		
		try {
			if (n <= 0) {
				throw new IllegalArgumentException("N must be positive! " + n);
			}
			
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
			System.exit(-1);
		}
		double sum = 0;
		
		for (int i = 0; i < n; i++) {
			boolean loop = true;
			do {
				try {
					loop = false;
					System.out.print("Enter the number ");
					int num = reader.nextInt();
					sum += num;
				} catch (InputMismatchException e) {
					reader.next();
					loop = true;
					System.err.println("invalid number");
				}
			} while (loop);
		}
		System.out.println();
		System.out.println("The average is " + sum / n);
	}
}
