package Lab07_Test;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		Shape area = new Area();
		
		System.out.print("Enter the length: ");
		double len = Double.parseDouble(reader.nextLine());
		
		System.out.print("Enter the breadth: ");
		double bre = Double.parseDouble(reader.nextLine());
		
		System.out.println("Area of Rectangle is " + area.RectangleArea(len, bre));
		System.out.println();
		
		System.out.print("Enter the side: ");
		double side = Double.parseDouble(reader.nextLine());
		
		System.out.println("Area of square is " + area.SquareArea(side));
		System.out.println();
		
		System.out.print("Enter the radius: ");
		double rad = Double.parseDouble(reader.nextLine());
		
		System.out.println("Area of circle is " + area.CircleArea(rad));
	}
}
