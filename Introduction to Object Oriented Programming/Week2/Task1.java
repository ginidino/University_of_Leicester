package Lab02;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter some text: ");
		String text = stdin.nextLine();
		
		System.out.print("How many times? ");
		int count = stdin.nextInt();
		
		for (int i = 0; i < count; ++i) {
			System.out.println((i + 1) + " " + text);
		}
	}
}