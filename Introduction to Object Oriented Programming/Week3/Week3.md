# Week3

## Task1
Create a class named MyTriangle that contains two static methods:   
```java
public static double area(double a, double b, double c) 
```
```java
public static double perimeter(double a, double b, double c) 
```
to compute area and perimeter of a triangle respectively given three valid sides a, b and c.

And add a static method to return true if the sum of any two sides is greater than the third side.

```java
public static boolean isValid(double a, double b, double c)
```

In the main method of MyTriangle, test the three methods you write.
1. Get a, b and c from the Console
2. If a is -1, exit your program and print “Bye ”.
3. If a is not -1, use isValid to check the input.
4. If the input is valid, compute the area and perimeter and print them.
5. If the input is not valid, return false and print “The input is invalid.”

Code
```java
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

```
Output
```
Enter the first side: 1
Enter the second side: 1
Enter the third side: 2
The input is invalid.

Enter the first side: 3
Enter the second side: 4
Enter the third side: 5

The area of triangle is 6.0
The perimeter of triangle is 12.0

Enter the first side: -1
Enter the second side: 1
Enter the third side: 2
The input is invalid.

Bye
```

## Task2
Create a class called AverageGrades which contain one method: 
```java
public static double Average(int grades[]){
.....
}
```
1. The application should ask the user to enter up to 20 grades.
2. The program should stop when the user enter any grade less than 0.
3. Call the Average method in the main class to observe the output.

Code
```java
package Lab03;

import java.util.Scanner;

public class Task2_AverageGrades {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int[] grades = new int[20];
		System.out.println("Enter the number, negative number completes:");
		int x = 0;
		for (int i = 0; i < grades.length; i++) {
			System.out.print("Enter your grade: ");
			String num = reader.nextLine();
			int theGrade = Integer.parseInt(num);
			if (theGrade < 0) {
				break;
			} else {
				grades[i] = Integer.parseInt(num);
			}
			x++;
		}
		System.out.println("Acceptance percentage: " + Average(grades, x));
	}
	
	public static double Average(int grades[], int x) {
		int sum = 0;
		for (int num : grades) {
			sum += num;
		}
		return (double) sum / x;
		/*double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
			
		}
		return sum / grades.length;*/
	}
}

```
Output
```
Enter the number, negative number completes:
Enter your grade: 1
Enter your grade: 1
Enter your grade: 1
Enter your grade: -1
Acceptance percentage: 1.0
```

## Task3-1
Write a program with the following requirements:
1. Implement a Person class that declares the variables name, surname, age. Also create a details() method that returns information about the person object with a string.
2. Implement a Main class that, in the main() method, presents two objects called person1 and person2 of the Person class, initializing the relative fields for each of them through the dot operator.
3. Declare a third reference (person3) that points to one of the objects already instantiated.
Check that actually person3 points to the desired object, printing the person3 fields always using the dot operator.

Your program structure should be like this:
```java
public class Main {
  public static void main(String args[]) {
    Person person1 = new Person();
    Person person2 = new Person();
    ......
  }
}
class Person {
  private String name;
  .... String surname;
  .... int age;
  
  public String getName() {
  ...
  }
  
  public void setName(String name) {
  ...
  }
...
  public String details() {
    return getName() + " " + getSurname() + " years " + getAge();
  }
```

Code
```java
package Lab03;

public class Task3_Person {
	public static void main(String[] args) {
//		Person person1 = new Person("Brian", "Pekka", 20);
//		Person person2 = new Person("injae", "Lee", 25);
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.setName("Brian");
		person1.setSurname("Pekka");
		person1.setAge(24);
		
		person2.setName("injae");
		person2.setSurname("Lee");
		person2.setAge(24);
		
		System.out.println(person1.details());
		System.out.println(person2.details());
		
		Person person3 = person2;
		System.out.println(person3.details());
	}
}

```
```java
package Lab03;

public class Person {
	private String name;
	private String surname;
	private int age;
	
	/*public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}*/
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String details() {
		return getName() + " " + getSurname() + " years " + getAge();
	}
}

```
Output
```
Brian Pekka years 24
injae Lee years 24
injae Lee years 24
```

## Task3-2
Declare a class named User. The class contains:
1. A private data fields:   
  (a) String accountNum   
  (b) double balance   
2. Implement a public method named introduce() to print the account number and the current balance.
3. implement a public method named deposit() to deposit money into account.
4. implement a public method named withdraw() to withdraw money into account.

Statements in main method:
```java
public class UserTest {
  public static void main(String[] args) {
    User first = new User();
    first.setAccountNum("1444-4345-4423-2322");
    first.setBalance(499);
    first.introduce();
    System.out.println(first.getAccountNum() + " Account has initial balance of " + first.getBalance());
    first.deposit(500);
    System.out.println(first.getAccountNum() + " Account balance after deposit is " + first.getBalance());
    first.withdraw(34);
    System.out.println(first.getAccountNum() + " Account balance after withdrawn is " + first.getBalance());
  }
}
```
Sample output:
```
Account number is: 1444-4345-4423-2322
Balance is: 499.0
1444-4345-4423-2322 Account has initial balance of 499.0
1444-4345-4423-2322 Account balance after deposit is 999.0
1444-4345-4423-2322 Account balance after withdrawn is 965.0
```

Code
```java
package Lab03;

public class Task3_UserTest {
	public static void main(String[] args) {
		User first = new User();
		first.setAccountNum("1444-4345-4423-2322");
		first.setBalance(499);
		first.introduce();
		System.out.println(first.getAccountNum() + " Account has initial balance of " + first.getBalance());
		first.deposit(500);
		System.out.println(first.getAccountNum() + " Account balance after deposit is " + first.getBalance());
		first.withdraw(34);
		System.out.println(first.getAccountNum() + " Account balance after withdrawn is " + first.getBalance());
	}
}

```
```java
package Lab03;

public class User {
	private String accountNum;
	private double balance;
	
	public String getAccountNum() {
		return this.accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public void withdraw(int amount) {
		this.balance -= amount;
	}
	
	public void introduce() {
		System.out.println("Account number is: " + this.accountNum + "\n" + "Balance is: " + this.balance);
	}
}

```
Output
```
Account number is: 1444-4345-4423-2322
Balance is: 499.0
1444-4345-4423-2322 Account has initial balance of 499.0
1444-4345-4423-2322 Account balance after deposit is 999.0
1444-4345-4423-2322 Account balance after withdrawn is 965.0
```
