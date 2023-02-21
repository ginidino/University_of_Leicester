package Lab5;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			System.out.print("Please type a string: ");
			String type = reader.nextLine();
			
			if (type.isEmpty()) {
				break;
			}
			
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < type.length(); i++) {
				char c = type.charAt(i);
				if (sb.indexOf(Character.toString(c)) == -1) {
	                sb.append(c);
	            }
			}
			
			System.out.println("After removing repeating chars and spaces: " + sb.toString());
			System.out.println();
		}
	}
}
