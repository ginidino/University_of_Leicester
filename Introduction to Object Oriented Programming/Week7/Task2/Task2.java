package Lab07_Test;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

        System.out.print("Enter first side of the triangle: ");
        double side1 = Double.parseDouble(reader.nextLine());
        
        System.out.print("Enter second side of the triangle: ");
        double side2 = Double.parseDouble(reader.nextLine());
        
        System.out.print("Enter third side of the triangle: ");
        double side3 = Double.parseDouble(reader.nextLine());

        System.out.print("Enter the color of the triangle: ");
        String color = reader.nextLine();

        System.out.print("Is the triangle filled? (true or false): ");
        boolean filled = Boolean.parseBoolean(reader.nextLine());

        GeometricObject triangle = new Triangle(side1, side2, side3, color, filled);
        
        System.out.println();
        System.out.println(triangle);
	}
}
