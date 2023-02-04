package Lab02;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter number of rows in pattern: ");
		int num = Integer.parseInt(reader.nextLine());
		
		for (int i = 1; i < num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
