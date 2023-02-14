# Week4

## Question1
Write a program defined by the PrintContacts class that prints the contact list of a phone book. Each contact must be printed on three lines: in the first there will be the name of the contact, in the second the address, and in the third the phone number. Each contact must be separated from the next one by an empty line.

Create a class named `Contact` that contains the necessary variables and one or more constructors.
```java
public class Contact {
  private String name;
  private String address;
  private String phoneNumber;
  
  public Contact(String nam, String num) {
  ....
  }
  
  public Contact(String nam, String add, String num) {
  ....
  }
  
  public void printDetails() {
  ....
  }
}
```
When running the program, you should get the following output:
```
Contacts List
Claudio De Sio Cesari
13
Java Street
Stevie Wonder
10, Music Avenue
1010101010
Gennaro Capuozzo
1, Four Days of Naples Square
1111111111
```

Code
```java
package Lab04;

public class Contact {
	private String name;
	private String add;
	private String phoneNumber;
	
	public Contact(String name, String num) {
		this.name = name;
		this.phoneNumber = num;
	}
	
	public Contact(String name, String add, String num) {
		this.name = name;
		this.add = add;
		this.phoneNumber = num;
	}
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.add;
	}
	
	public String getNum() {
		return this.phoneNumber;
	}
	
	public void printDetails() {
		System.out.println(this.getName() + "\n" + this.getAddress() + "\n" + this.getNum());
	}
}

```
```java
package Lab04;

import java.util.Scanner;

public class PrintContacts {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Contact contact = new Contact();
		
		while (true) {
			System.out.print("Enter the name: ");
			String name = reader.nextLine();
			
			if (name.isEmpty()) {
				break;
			}
			
//			System.out.print("Enter the address number: ");
//			int addNum = Integer.parseInt(reader.nextLine());
			
			System.out.print("Enter the address: ");
			String add = reader.nextLine();
			
			System.out.print("Enter the phone number: ");
			String num = reader.nextLine();
			//System.out.println();
			
			//contact = new Contact(name, num);
			
			//contact.printDetails();
			//System.out.println();
			
			contact = new Contact(name, add, num);
			System.out.println("Contacts List\n");
			contact.printDetails();
			
			System.out.println();
		}
		
	}
}

```
Output
```
Contacts List
Claudio De Sio Cesari
13
Java Street
Stevie Wonder
10, Music Avenue
1010101010
Gennaro Capuozzo
1, Four Days of Naples Square
1111111111
```

## Question2
Define the Circle2D class that contains:
1. Two private double data fields named x and y that specify the center of the circle with getter methods.
2. A data field radius with a getter method.
3. A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for radius.
4. A constructor that creates a circle with the specified x, y, and radius.
5. A method `getArea()` that returns the area of the circle.
6. A method `getPerimeter()` that returns the perimeter of the circle.
7. A method `contains(double x, double y)` that returns true if the specified point (x, y) is inside this circle.
```java
public boolean contains(double x, double y){
......
}
```
8. A method `contains(Circle2D circle)` that returns true if the specified circle is inside this circle.
```java
public boolean contains(Circle2D circle){
......
}
```
A method `overlaps(Circle2D circle)` that returns true if the specified circle overlaps with this circle.
```java
public boolean overlaps(Circle2D circle){
......
}
```
Create a main class called Circle2DTest that creates a `Circle2D` object `c1 (new Circle2D(2, 2, 5.5))` displays its area and perimeter, and displays the result of `c1.contains(3, 3)`, `c1.contains(new Circle2D(4, 5, 10.5))`, and `c1.overlaps(new Circle2D(3, 5, 2.3))`.

Code
```java
package Lab04;

public class Circle2D {
	private int x;
	private int y;
	private double radius;
	
	public Circle2D(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	public double getPerimeter() {
		return 2 * this.radius * Math.PI;
	}
	
	public boolean contains(double x, double y){
//		double distance = Math.pow(getX() - x, 2) + Math.pow(getY() - y, 2);
//		if (distance <= Math.pow(radius, 2)) {
//			return true;
//		} else {
//			return false;
//		}	
		return Math.sqrt(Math.pow(x - this.x, 2) +  Math.pow(y - this.y, 2)) < radius;
	}
	
	public boolean contains(Circle2D circle){
//		double distance = Math.pow(circle.x - getX(), 2) + Math.pow(circle.y - getY(), 2);
//		if (distance <= (Math.pow(radius, 2) - Math.pow(circle.radius, 2))) {
//			return true;
//		} else {
//			return false;
//		}
		return Math.sqrt(Math.pow(circle.getX() - x, 2) +  Math.pow(circle.getY() - y, 2)) <= Math.abs(radius - circle.getRadius());
	}
	
	public boolean overlaps(Circle2D circle){
//		double distance = Math.pow(circle.x - getX(), 2.0) + Math.pow(circle.y - getY(), 2.0);
//		if (distance > Math.abs(Math.pow(radius, 2.0) - Math.pow(circle.radius, 2.0))) {
//			return true;
//		} else {
//			return false;
//		}
		return Math.sqrt(Math.pow(circle.getX() - x, 2) +  Math.pow(circle.getY() - y, 2)) >= radius + circle.getRadius();
	}
}

```
```java
package Lab04;

public class Circle2DTest {
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		
		System.out.println("The area of circle is " + c1.getArea());
		System.out.println("The  perimeter of the circle is " + c1.getPerimeter());
		System.out.println(c1.contains(3, 3));
		System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(c1.overlaps(new Circle2D(2, 2, 5.5)));
//		if (c1.contains(3, 3) == true) {
//			System.out.println("the specified point is inside this circle. ");
//		} else {
//			System.out.println("the specified point is not inside this circle. ");
//		}
//		if (c1.contains(new Circle2D(4, 5, 10.5)) == true) {
//			System.out.println("the specified circle is inside this circle.");
//		} else {
//			System.out.println("the specified circle is not inside this circle.");
//		}
//		if (c1.overlaps(new Circle2D(3, 5, 2.3)) == true) {
//			System.out.println("the specified circle overlaps with this circle.");
//		} else {
//			System.out.println("the specified circle does not overlaps with this circle.");
//		}
	}
}
```
Output
```
The area of circle is 95.03317777109125
The  perimeter of the circle is 34.55751918948772
true
false
false
```

## Question3
The goal of these exercises is to gain practice with Composition in Java. Let’s create three classes: the Main Class, the Parent class, and the child class. We will be running the programs at the Main class and creating the methods and attributes at the parent and child classes. Therefore, ensure that all your classes are in the same package of your project.

Code
```java
public class Engine {
  private String model;
  private int weight;
  private String color;
  private int price;
  
  public Engine(String model, int weight, String color, int price) {
    this.model = model;
    this.weight = weight;
    this.color = color;
    this.price = price;
  }
  
  public Engine(String rpm, int weight, String silver) {
  }
  
  public String getModel() {
    return model;
  }
  
  public void setModel(String model) {
    this.model = model;
  }
  public int getWeight() {
    return weight;
  }
  public void setWeight(int weight) {
    this.weight = weight;
  }
  
  public String getColor() {
    return color;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  
  public int getPrice() {
    return price;
  }
  
  public void setPrice(int price) {
    this.price = price;
  }
}
```
We have created a class named `Engine` from the above code. We have allocated some attributes and given all the access specifiers private to make it only accessible by the class itself or via the `getters` from another class. We also have `getters` and `setters` to enable the attributes accessible from an outside class. We will now create the parent class, which is the class Vehicle. Finally, we will link the

Class Engine with the Class `Vehicle` by creating an Engine attribute.
```java
public class Vehicle {
	private String name;
	private String color;
	private int price;
	private int wheels;
	private Engine engine;
	
	public Vehicle(String name, String color, int price, int wheels, Engine engine) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.wheels = wheels;
		this.engine = engine;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
	public String getColor() {
		return color;
	}
		
	public void setColor(String color) {
		this.color = color;
	}
		
	public int getPrice() {
		return price;
	}
		
	public void setPrice(int price) {
		this.price = price;
	}
		
	public int getWheels() {
		return wheels;
	}
		
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
		
	public Engine getEngine() {
		return engine;
	}
		
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
}
```
We have treated the child class `Engine` as an attribute, even though it is not. So we have initialized it, created a constructor for it, and created a `getter` and `setter` for it, just like any other attribute. Let us now create the Main class where we will run and implement the code.
```java
public class Main {
	public static void main(String[] args) {
		Engine engine = new Engine("high", 24, "silver", 40);
		Vehicle benz = new Vehicle("benz", "black", 200, 4, engine);
		System.out.println("I have a " + benz.getColor() + " " + benz.getName());
		System.out.println("With a weight of " + benz.getEngine().getWeight() + " TONNES");
		System.out.println("The Price is " + engine.getPrice());
	}
}
```
Output
```
I have a black benz
With a weight of 24 TONNES
The Price is 40
```

## Question4
Define the Job class that continas the following private fileds:
```java
private String role;
private long salary;
private int id;
```
Create a constructor for this class as well as the setter and getter methods to return the values of those attributes.
```java
public Job(String role, double salary, int id) {
  ....
  ....
  ....
  }
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  .....
}
```
Create another class named `Person` to link with the class `Job` by creating job attribute.
```java
public class Person {
  private Job job;
  .....
}
```
Create a main method named: PersonTest to run and implement the code.
```java
public class PersonTest {
	public static void main(String[] args) {
		Job job = new Job("Software Engineer", 1800, 3124);
		Person person = new Person(job);
		System.out.println("ID of person : " + person.getJob().getId());
		System.out.println("Salary of person : " + person.getJob().getSalary());
		System.out.println("Role of person : " + person.getJob().getRole());
	}
}

```
When running the program, you should get the following output:
```
ID of person :3124
Salary of person :1800.0
Role of person :Software Engineer
```

Code
```java
package Lab04;

public class Person {
	//private int id;
	private Job job;

	public Person(Job job) {
		this.job = job;
	}

	public Job getJob() {
		return this.job;
	}

}
```
```java
package Lab04;

public class Job {
	private String role;
	private long salary;
	private int id;

	public Job(String role, long salary, int id) {
		this.role = role;
		this.salary = salary;
		this.id = id;
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public long getSalary() {
		return this.salary;
	}
	
	public String getRole() {
		return role;
	}
}
```
```java
package Lab04;

public class PersonTest {
	public static void main(String[] args) {
		Job job = new Job("Software Engineer", 1800, 3124);
		Person person = new Person(job);
		System.out.println("ID of person : " + person.getJob().getId());
		System.out.println("Salary of person : " + person.getJob().getSalary());
		System.out.println("Role of person : " + person.getJob().getRole());
	}
}
```
Output
```
ID of person :3124
Salary of person :1800.0
Role of person :Software Engineer
```
