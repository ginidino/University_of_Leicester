# Week1 Lab

## Question 1.3
Write a simple program that performs the following arithmetic operations correctly, carefully choosing the data types to be used to store their results.

1. A division (use the / symbol) between two integers a = 5, and b = 3. Store the result in a variable r1, choosing the data type appropriately.
2. A multiplication (use the * symbol) between a char c = ‘a’, and a short s = 5000. Store the result in a variable r2, choosing the type of data appropriately.
3. A subtraction (use the - symbol) between r1, r2 and r3. Store the result in a variable r4, choosing the data type appropriately.

Verify the correctness of the operations by printing the partial results and the final result.

Code
```java
public class workshop01_3 {
	public static void main(String[] args) {
		double a = 5;
		double b = 3;
		
		double r1 = a / b;
		System.out.println("The division of " + a + " and " + b + " is " + r1);
		
		char c = 'a';
		short s = 5000;
		
		int r2 = c * s;
		System.out.println("The multiplication of " + c + " and " + s + " is " + r2);
		
		int r3 = 400;
		
		double r4  = r1 - r2 - r3;
		System.out.println("The subtraction of " + r1 + ", " + r2 + " and " + r3 + " is " + r4);
	}
}
```

Output
```
The division of 5.0 and 3.0 is 1.6666666666666667
The multiplication of a and 5000 is 485000
The subtraction of 1.6666666666666667, 485000 and 400 is -485398.3333333333
```

## Question 1.4
Write an application that asks the user to enter two integers, obtains them from the user and displays the larger number followed by the words “is larger”. If the numbers are equal, print “These numbers are equal”.

Code
```java
import java.util.Scanner;

public class workshop01_4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int num1 = Integer.parseInt(reader.nextLine());
		// int num1 = reader.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " is less than " + num2);
		} else {
			System.out.println("These numbers are equal.");
		}
	}
}
```

Output
```
Enter the first number: 3
Enter the second number: 4
4 is greater than 3
```
```
Enter the first number: 2
Enter the second number: 4
2 is less than 4
```
```
Enter the first number: 3
Enter the second number: 3
These numbers are equal.
```
