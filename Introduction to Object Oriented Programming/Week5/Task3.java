package Lab5;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter string s1: ");
			String s1 = reader.nextLine();
			
			System.out.print("Enter string s2: ");
			String s2 = reader.nextLine();
			
			/*if (s1.contains(s2)) {
	            System.out.println(s2 + " is a substring of " + s1);
	            System.out.println();
	        } else {
	            System.out.println(s2 + " is not a substring of " + s1);
	            System.out.println();
	            break;
	        }*/
			
			if (s1.indexOf(s2) == -1) {
				System.out.println(s2 + " is not a substring of " + s1);
				System.out.println();
				break;
			} else {
				System.out.println(s2 + " is a substring of " + s1);
	            System.out.println();
			}
		}
	}
}
