package Lab08;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		GeometricObject[] objects = new Square[5];
		
		double[] side = new double[5];
		System.out.println("Enter the 5 side: ");
		for (int i = 0; i < objects.length; i++) {
			side[i] = Double.parseDouble(reader.nextLine());
		}
        objects[0] = new Square(side[0], true);
        objects[1] = new Square(side[1], false);
        objects[2] = new Square(side[2], true);
        objects[3] = new Square(side[3], true);
        objects[4] = new Square(side[4], false);
        System.out.println();
        
        for (GeometricObject obj : objects) {
            System.out.println("Area: " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
            System.out.println();
        }
	}
}
