# Week7

## Introduction
How to implement Abstract class in java with a simple example. Let’s create an `abstract class` called `Person`:
```java
public abstract class Person {
  private String name;
  private String gender;
  
  public Person(String nm, String gen) {
    this.name = nm;
    this.gender = gen;
  }
// abstract method
  public abstract void work();
    @Override
    public String toString() {
      return "Name=" + this.name + "::Gender=" + this.gender;
    }
    
    public void changeName(String newName) {
      this.name = newName;
    }
}
```
Notice that `work()` is an `abstract` method and it has no-body. Here is a concrete class example extending an abstract class in java. Note that subclass Employee inherits the properties and
methods of *superclass* `Person` using *inheritance* in java. Also notice the use of `Override` annotation in `Employee` class.

```java
public class Employee extends Person {
  private int empId;
  
  public Employee(String nm, String gen, int id) {
    super(nm, gen);
    this.empId = id;
  }
  
  @Override
  public void work() {
    if (empId == 0) {
      System.out.println("Not working");
    } else {
      System.out.println("Working as employee!!");
    }
  }
}
```
Now, let’s create a main class to show the output:

```java
public class EmployeeTest {
  public static void main(String args[]) {
    Person student = new Employee("Dove", "Female", 0);
    Person employee = new Employee("Pankaj", "Male", 123);
    student.work();
    employee.work();
    employee.changeName("Pankaj Kumar");
    System.out.println(employee.toString());
  }
}
```

## Task1
Write a program in which you will declare an *abstract* class `Vehicle` inherits this class from two classes `car` and `truck` using the method `engine` in both display `"car has good engine"` and `"truck has bad engine"`.

Code
```java
package Lab07_Test;

public class Task1 {
	public static void main(String[] args) {
		Vehicle myCar = new Car();
        Vehicle myTruck = new Truck();
        
        myCar.engine();
        myTruck.engine();
	}
}
```
```java
package Lab07_Test;

public abstract class Vehicle {
	public abstract void engine();
}

class Car extends Vehicle {
    
	@Override
	public void engine() {
        System.out.println("Car has good engine");
    }
}

class Truck extends Vehicle {
    
	@Override
    public void engine() {
        System.out.println("Truck has bad engine");
    }
}
```
Output
```
Car has good engine
Truck has bad engine
```

## Task2
Design a new `Triangle` class that extends the *abstract* `GeometricObject` class. Write a test program that prompts the user to *enter three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled*.

The program should create a `Triangle` object with *these sides and set the color and filled properties using the input*. The program should display *the area, perimeter, color, and true or false to indicate whether it is filled or not*.

Code
```java
package Lab07_Test;

public abstract class GeometricObject {
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public abstract String getColor();
	
	public abstract boolean isFilled();
}
class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private String color = "white";
	private boolean filled;

	public Triangle(double side1, double side2, double side3, String color, boolean filled) { 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.color = color;
		this.filled = filled;
	}

	public double getSide1() {
		return this.side1;
	}

	public double getSide2() {
		return this.side2;
	}

	public double getSide3() {
		return this.side3;
	}
	
	@Override
	public double getArea() {
		double s = (this.side1 + this.side2 + this.side3) / 2;
		return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
	}
	
	@Override
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public boolean isFilled() {
		return this.filled;
	}
	
	@Override
	public String toString() {
		return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3 + "\nArea: " + this.getArea() 
		+ "\nPerimeter: " + this.getPerimeter() + "\nColor: " + this.color + "\nFilled: " + this.filled;
	}
}
```
```java
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
```
Output
```
Enter first side of the triangle: 3
Enter second side of the triangle: 4
Enter third side of the triangle: 5
Enter the color of the triangle: red
Is the triangle filled? (true or false): true

Triangle: side1 = 3.0 side2 = 4.0 side3 = 5.0
Area: 6.0
Perimeter: 12.0
Color: red
Filled: true
```

## Task3
Create an *abstract* class `Shape` with three *abstract* methods namely `RectangleArea` taking two parameters, `SquareArea` and `CircleArea` taking one parameter each.

The parameters of `RectangleArea` are its *length and breadth*, that of `SquareArea` is its *side* and that of `CircleArea` is its *radius*. Now create another class Area containing all the *three methods* `RectangleArea`, `SquareArea` and `CircleArea` for printing the area of *rectangle*, *square* and *circle* respectively. Create an object of class Area and call all the three methods.

Code
```java
abstract class Shape {

	public abstract double RectangleArea(double len, double bre);
	
	public abstract double SquareArea(double side);
	
	public abstract double CircleArea(double rad);
}

class Area extends Shape {

	@Override
	public double RectangleArea(double len, double bre) {
		return len * bre;
	}

	@Override
	public double SquareArea(double side) {
		return side * side;
	}

	@Override
	public double CircleArea(double rad) {
		return Math.PI * rad * rad;
	}
}
```
```java
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

```
Output
```
Enter the length: 2
Enter the breadth: 10
Area of Rectangle is 20.0

Enter the side: 4
Area of square is 16.0

Enter the radius: 2
Area of circle is 12.566370614359172
```
