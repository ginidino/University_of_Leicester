# Week6

## Introduction
The goal of these exercises is to gain practice with inheritance in JAVA.   
Let’s see how to implement inheritance in java with a simple example.

```java
public class Animal {
  private boolean vegetarian;
  private String eats;
  private int noOfLegs;
  
  public Animal() {
  }
  
  public Animal(boolean veg, String food, int legs) {
    this.vegetarian = veg;
    this.eats = food;
    this.noOfLegs = legs;
  }
  
  public boolean isVegetarian() {
    return vegetarian;
  }
  
  public void setVegetarian(boolean vegetarian) {
    this.vegetarian = vegetarian;
  }
  
  public String getEats() {
    return eats;
  }
  
  public void setEats(String eats) {
    this.eats = eats;
  }
  
  public int getNoOfLegs() {
    return noOfLegs;
  }
  
  public void setNoOfLegs(int noOfLegs) {
    this.noOfLegs = noOfLegs;
  }
}
```
The `Animal` is the base class here. Let’s create a Cat class that inherits from Animal class.
```java
public class Cat extends Animal {
  private String color;
  
  public Cat(boolean veg, String food, int legs) {
    super(veg, food, legs);
    this.color = "White";
  }
  
  public Cat(boolean veg, String food, int legs, String color) {
    super(veg, food, legs);
    this.color = color;
  }
  
  public String getColor() {
    return color;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
}
```
Notice that we are using `extends` keyword to implement inheritance in java. Now, let’s write a simple test class to create a `Cat` object and use some of its methods.
```java
public class AnimalInheritanceTest {
  public static void main(String[] args) {
    Cat cat = new Cat(false, "milk", 4, "black");
    System.out.println("Cat is Vegetarian?" + cat.isVegetarian());
    System.out.println("Cat eats " + cat.getEats());
    System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
    System.out.println("Cat color is " + cat.getColor());
  }
}
```

## Question1
Design a class named Triangle that extends GeometricObject. The class contains:

* Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
* A no-arg constructor that creates a default triangle.
* A constructor that creates a triangle with the specified side1, side2, and side3.
* The accessor methods for all three data fields.
* A method named getArea() that returns the area of this triangle.
* A method named getPerimeter() that returns the perimeter of this triangle.
* A method named toString() that returns a string description for the triangle

For the formula to compute the area of a triangle, use the following formula in toString() method.
```java
return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
```
Write a test program that prompts the user to enter three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled. The program should create a `Triangle` object with these sides and set the color and filled properties using the input. The program should display the *area, perimeter, color, and true or false* to indicate whether it is filled or not.

Code
```java
package Lab06;

public class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle(double side1, double side2, double side3) { 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	public GeometricObject() {
		dateCreated = new java.util.Date();
	}


	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
}
```
```java
package Lab06;

import java.util.Scanner;

public class Task1 {
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

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);
        
        System.out.println();
        System.out.println(triangle);
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
```
Output
```
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

## Question2
Design a class named `Person` and its two subclasses named `Student` and `Employee`. Make `Faculty` and `Staff` subclasses of `Employee`.
* A person has a *name, address, phone number, and email address*.
* A student has a class *status (freshman, sophomore, junior, or senior)*. Define the status as a constant.
* An employee has an *office, salary, and date hired*. 
  > **(Hint: you could use the composition or java.util.Date to create an object for date hired)**.
* A faculty member has *office hours and a rank*.
* A staff member has a *title*.

Override the `toString()` method in each class to display the class name and the person’s name. Write a test program that creates a `Person`, `Student`, `Employee`, `Faculty`, and `Staff`, and invokes their `toString()` methods.

Code
```java
package Lab06;

import java.util.Date;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": " + this.name;
    }
}


class Student extends Person {
	private int status;
	static int FRESHMAN = 1;
	public final static int SOPHOMORE = 3;
	public final static int JUNIOR = 2;
	public final static int SENIOR = 4;

	public Student(String name, String address, String phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}

	public void setStatus(int status) {
		this.status = status; 
	}

	public String getStatus() {
		String status = "";
		if (this.status == 1) {
			status = "freshman";
		} else if (this.status == 2) {
			status = "sophomore";
		} else if (this.status == 3) {
			status = "junior";
		} else if (this.status == 4) {
			status = "senior";
		}
		return status;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nStatus: " + this.getStatus();
	}
}

class Employee extends Person {
	private String office;
    private double salary;
    private Date dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

	public String getOffice() {
        return this.office;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDateHired() {
        return this.dateHired;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
    
    @Override
	public String toString() {
		return super.toString() + "\nOffice: " + this.office + "\nSalary: £" + this.salary + "\nDate hired: " + this.dateHired;
	}
}


class Faculty extends Employee {
	private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

	public String getOfficeHours() {
		return this.officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String toString() {
		return super.toString() + "\nOffice hours: " + this.officeHours + "\nRank: " + this.rank;
	}
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return super.toString() + "\nTitle: " + this.title;
	}
}

```
```java
package Lab06;

import java.util.Date;

public class Task2 {
    public static void main(String[] args) {
        Person person = new Person("injae Lee", "162 London Road", "7541548927", "il74@student.le.ac.uk");
        System.out.println(person);
        System.out.println();
        
        Student student = new Student("injae Lee", "162 London Road", "7541548927", "il74@student.le.ac.uk", Student.FRESHMAN);
        System.out.println(student);
        System.out.println();
        
        Employee employee = new Employee("Kim", "30 Staniforth St", "010-1234-1234", "kim@email.com", "123", 50000.0, new Date());
        System.out.println(employee);
        System.out.println();
        
        Faculty faculty = new Faculty("Lee", "495 Bristol Rd", "010-1234-1234", "lee@email.com", "456", 75000.0, new Date(), "9am-5pm", "Professor");
        System.out.println(faculty);
        System.out.println();
        
        Staff staff = new Staff("Han", "Manor Rd", "010-1234-1234", "tom@email.com", "789", 40000.0, new Date(), "Administrative Assistant");
        System.out.println(staff);
    }
}

```
Output
```
Lab06.Person: injae Lee

Lab06.Student: injae Lee
Status: freshman

Lab06.Employee: Kim
Office: 123
Salary: £50000.0
Date hired: Fri Mar 03 14:49:45 GMT 2023

Lab06.Faculty: Lee
Office: 456
Salary: £75000.0
Date hired: Fri Mar 03 14:49:45 GMT 2023
Office hours: 9am-5pm
Rank: Professor

Lab06.Staff: Han
Office: 789
Salary: £40000.0
Date hired: Fri Mar 03 14:49:45 GMT 2023
Title: Administrative Assistant

```

## Question3
Design a class named `Account` to model a bank account. This class has the following properties:
* *Account number, balance, annual interest rate, and date* created.
* Methods to *deposit and withdraw funds*.

Create two subclasses for checking and saving accounts. A checking account has an overdraft limit, but a savings account cannot be overdrawn.

Write a test program that creates objects of `Account`, `SavingsAccount`, and `CheckingAccount` and invokes their `toString()` methods.

Code
```java
package Lab06;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private static double interestRate;
	private Date dateCreated;

	public Account() {
		
	}

	public Account(int id, double balance, double interestRate, Date dateCreated) {
		this.id = id;
		this.balance = balance;
		this.interestRate = 0;
		this.dateCreated = dateCreated;
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return this.interestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.interestRate = annualInterestRate;
	}

	public String getDateCreated() {
		return this.dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return this.interestRate / 12;
	}

	public double getMonthlyInterest() {
		return this.balance * (this.getMonthlyInterestRate() / 100);
	}

//	public void withdraw(double amount) {
//		this.balance -= amount;
//	}
//
//	public void deposit(double amount) {
//		this.balance += amount;
//	}
	
	@Override
	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + this.dateCreated + "\nBalance: £" + String.format("%.2f", this.balance) + "\nMonthly interest: £" + String.format("%.2f", this.getMonthlyInterest());
	}
}

class SavingsAccount extends Account {
    //private static final double MIN_BALANCE = 0.0;

	public SavingsAccount(int id, double balance, double interestRate, Date dateCreated) {
		super(id, balance, interestRate, dateCreated	);
	}

	public void withdraw(double amount) {
		if (amount < this.getBalance()) {
			this.setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error!");
	}
	
	public void deposit(double amount) {
		this.setBalance(this.getBalance() + amount);
	}
}

class CheckingAccount extends Account {
	private double overdraftLimit = -200;

	public CheckingAccount(int id, double balance, double interesteRate, Date dateCreated, double overdraftLimit) {
		super(id, balance, interesteRate, dateCreated);
		this.overdraftLimit = overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return this.overdraftLimit;
	}

	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error!");
	}
	
	public void deposit(double amount) {
		this.setBalance(this.getBalance() + amount);
	}
	
//	@Override
//	public String toString() {
//		return super.toString() + "\nOverdraft limit: £" + String.format("%.2f", this.overdraftLimit);
//	}
}
```
```java
package Lab06;

import java.util.Date;

public class Task3 {
	public static void main(String[] args) {
		Account account = new Account(1122, 200, 1.2, new Date());
		System.out.println(account + "\n");
		SavingsAccount savings = new SavingsAccount(1001, 200, 1.2, new Date());
		CheckingAccount checking = new CheckingAccount(1004, 2000, 1.2, new Date(), -20);

		//account.withdraw(2500);
		//savings.withdraw(2500);
		checking.withdraw(2500);
		checking.withdraw(10);

		//account.deposit(3000);
		//savings.deposit(3000);
		checking.deposit(3000);

		System.out.println(account + "\n");
		System.out.println(savings + "\n");
		System.out.println(checking);
    }
}
```
Output
```
Account ID: 1001
Date created: Fri Mar 03 14:49:10 GMT 2023
Balance: £200.00
Monthly interest: £0.00


Account ID: 1004
Date created: Fri Mar 03 14:49:10 GMT 2023
Balance: £4990.00
Monthly interest: £0.00

```
