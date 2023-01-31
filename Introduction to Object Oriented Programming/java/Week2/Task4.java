package Lab02;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a month: ");
		int month = Integer.parseInt(reader.nextLine());
		
		int days = 0;
		
		switch(month) { 
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			days = 31;
			System.out.println("until " + days + "th"); 
			break; 
		case 4: case 6: case 9: case 11: 
			days = 30;
			System.out.println("until " + days + "th"); 
			break; 
		case 2:
			days = 28;
			System.out.println("until " + days + "th"); 
			break;
		default: 
			days = 0;
			System.out.println("error!!!");
			break; 
		}
		System.out.println();
		
		if (days != 0) {
			System.out.println("Number of days in " + month + " is: " + days);
		} else {
			System.out.println("You have entered an invalid month!!!");
		}
	}
}
