# Week8 - Lab8

## Introduction
The goal of these exercises is to gain practice with polymorphism and exceptions in JAVA

## Task 1
Design an interface named `Colorable` with a void method named `howToColor()`.
* Every class of a colorable object must implement the `Colorable interface`.
* Design a class named Square that `extends GeometricObject` and `implements Colorable`.
* Implement howToColor to display the message Color all four sides.

Please design your classes and interface using this structure:
```java
public interface Colorable {
  // Your interface method goes here
}

public abstract class GeometricObject implements Colorable {
  //This is the abstract class which implements the interface class
}

public class Square extends GeometricObject {
  //A subclass that extends the superclass(abstract class) GeometricObject
}
```
Write a test program that creates an array of five `GeometricObjects`. For each object in the array, display its area and invoke its `howToColor` method if it is colorable.

Code
```java
public interface Colorable {
	public void howToColor();
}
```
```java
public abstract class GeometricObject implements Colorable {
	private boolean colourable;
	
	public GeometricObject() {
		this.colourable = true;
	}
	
    public abstract double getArea();
	
	@Override
	public void howToColor() {
        if (this.colourable == true) {
        	System.out.println("This shpae is colourable.");
        } else {
        	System.out.println("this shape is not colouralbe.");
        }
    }
}
```
```java
public class Square extends GeometricObject {
	private double side;
	private boolean colourable;
	
    public Square(double side, boolean colourable) {
        this.side = side;
        this.colourable = colourable;
    }

    @Override
	public void howToColor() {
        if (this.colourable == true) {
        	System.out.println("This shpae is colourable.");
        } else {
        	System.out.println("this shape is not colouralbe.");
        }
    }

	@Override
	public double getArea() {
		return this.side * this.side;
	}
}
```
```java
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
```
Output
```
Enter the 5 side: 
2
3
4
5
6

Area: 4.0
This shpae is colourable.

Area: 9.0
this shape is not colouralbe.

Area: 16.0
This shpae is colourable.

Area: 25.0
This shpae is colourable.

Area: 36.0
this shape is not colouralbe.
```

## Task2
Define an interface named `Shape` with a single method named `area` that `calculates the area of the geometric shape`:
```java
public double area();
```
Next, define a class named `Circle` that `implements Shape`. The `Circle` class should have an instance variable for the *radius*, a constructor that sets the *radius*, *accessor*/ *mutator* methods for the radius, and an `implementation of the area method`.   
Also define a class named `Rectangle` that `implements Shape`. The `Rectangle` class should have instance variables for the *height* and *width*, a constructor that sets the *height* and *width*, *accessor* and *mutator* methods for the height and width, and an `implementation of the area method`.

The following test code should then output the area of the `Circle` and `Rectangle` objects:
```java
	public static void main(String[] args) {
		Circle c = new Circle(4); // Radius of 4
		Rectangle r = new Rectangle(4,3); // Height = 4, Width = 3
		ShowArea(c);
		ShowArea(r);
	}

	public static void ShowArea(Shape s) {
	    double area = s.area();
	    System.out.println("The area of the shape is " + area);
	}
```

Code
```java
public class Circle implements Shape {
	private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return this.radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
```
```java
public class Rectangle implements Shape {
	private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getHeight() {
        return this.height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double area() {
        return width * height;
    }
}
```
```java
public class Task2 {
	public static void main(String[] args) {
		Circle c = new Circle(4); // Radius of 4
		Rectangle r = new Rectangle(4,3); // Height = 4, Width = 3
		ShowArea(c);
		ShowArea(r);
	}

	public static void ShowArea(Shape s) {
	    double area = s.area();
	    System.out.println("The area of the shape is " + area);
	}
}
```
Output
```

```

## Task3
Write a program that calculates the average of N integers.
* The program should prompt the user to enter the value for N and then afterward must enter all N numbers.
* If the user enters a nonpositive value for N, then an exception should be thrown (and caught) with the message “N must be positive.”
* If there is any exception as the user is entering the N numbers, an error message should be displayed, and the user prompted to enter the number again.

Code
```java
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
					System.out.println("Enter the number ");
					int num = reader.nextInt();
					sum += num;
				} catch (InputMismatchException e) {
					reader.next();
					loop = true;
					System.err.println("invalid number");
				}
			} while (loop);
		}
		System.out.println(sum / n);
	}
}
```
Output
```
Enter the number: -1
N must be positive! -1
```
```
Enter the number: 2
Enter the number a
invalid number
Enter the number 
3
Enter the number a
invalid number
Enter the number b
invalid number
Enter the number 1

The average is 2.0
```

## Task4
Define a class to maintain bank accounts of customers. The program should place the code into a `try-catch` block with multiple catches to check for the validity of various attributes based on the following criteria:
* Customer ID must start with a letter and should be followed by three digits.
* Account number must be of five digits.
* Initial balance must be above $1000.

Print suitable error matches within the catch block. If any of the criteria mentioned above is not fulfilled, the program should loop back and let the user enter new data.

Code
```java
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while (true) {
		      try {
		        System.out.print("Enter customer ID: ");
		        String customerID = reader.nextLine();
		        if (!customerID.matches("[A-Za-z]\\d{3}")) {
		          throw new Exception("Customer ID must start with a letter and should be followed by three digits.");
		        }

		        System.out.print("Enter account number: ");
		        String accountNumber = reader.nextLine();
		        if (accountNumber.length() != 5) {
		          throw new Exception("Account number must be of five digits.");
		        }

		        System.out.print("Enter initial balance: ");
		        double balance = Double.parseDouble(reader.nextLine());
		        if (balance < 1000.00) {
		          throw new Exception("Initial balance must be above $1000.");
		        }
		        System.out.println();
		        System.out.print("Data entered successfully.");
		        System.out.println("Customer ID: " + customerID);
		        System.out.println("Account Number: " + accountNumber);
		        System.out.println("initial balance: " + balance);
		        break;
		      } catch (Exception e) {
		        System.out.println(e.getMessage());
		      }
		}
	}
}
```
Output
```
Enter customer ID: jjj123
Customer ID must start with a letter and should be followed by three digits.
Enter customer ID: jj12j
Customer ID must start with a letter and should be followed by three digits.
Enter customer ID: jj123
Customer ID must start with a letter and should be followed by three digits.
Enter customer ID: j123
Enter account number: 123
Account number must be of five digits.
Enter customer ID: j123
Enter account number: 12345
Enter initial balance: 10
Initial balance must be above $1000.
Enter customer ID: j123
Enter account number: 12345
Enter initial balance: 100000

Data entered successfully.Customer ID: j123
Account Number: 12345
initial balance: 100000.0
```
