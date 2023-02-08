package Lab03;

import java.util.Scanner;

public class Task1_MyTriangle {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter the first side: ");
			double side1 = Double.parseDouble(reader.nextLine());
			
			System.out.print("Enter the second side: ");
			double side2 = Double.parseDouble(reader.nextLine());
			
			System.out.print("Enter the third side: ");
			double side3 = Double.parseDouble(reader.nextLine());
			
			if (isValid(side1, side2, side3) == false) {
				System.out.println("The input is invalid." + '\n');
			} else if (isValid(side1, side2, side3) == true) {
				System.out.println();
				System.out.println("The area of triangle is " + area(side1, side2, side3));
				System.out.println("The perimeter of triangle is " + perimeter(side1, side2, side3));
				System.out.println();
			}
			
			if (side1 == -1) {
				System.out.println("Bye");
				break;
			}
		}
	}
	
	public static boolean isValid(double a, double b, double c) {
		if (a + b > c && a + c > b && b + c > a) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double area(double a, double b, double c) {
		double s = (a + b + c) / 2;
		
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}
	
	public static double perimeter(double a, double b, double c) {
		return a + b + c;
	}
}
