# Week2

## Question1
Create a new Java class called Task1 and paste in this code:

Code
```java
package Lab02;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Enter some text: ");
		String text = stdin.nextLine();
		
		System.out.print("How many times? ");
		int count = stdin.nextInt();
		
		for (int i = 0; i < count; ++i) {
			System.out.println((i + 1) + " " + text);
		}
	}
}
```

Output
```
Enter some text: java
How many times? 3
1 java
2 java
3 java
```

## Question2
Write a simple program consisting of a single class, which using only an infinite loop, the modulo operator, two if constructs, a break and a continue, print only the first five even numbers.

Code
```java
package Lab02;

public class Task2 {
	public static void main(String[] args) {
		int counter = 0;
		int num = 0;
		
		while (true) {
			if (counter == 5) {
				break;
			}
			
			if (num % 2 == 0) {
				System.out.print(num + " ");
				counter++;
				num++;
				continue;
			} 
				num++;
				
			
		}
	}
}

```

Output
```
0 2 4 6 8 
```

## Question3
Write a simple class that prints out the multiplication table.

* Tip 1: Arrays are not required.
* Tip 2: the System.out.println() method prints the argument passed as input to it, and then moves the cursor to the next line; in fact, println stands for “print line”. There is also the System.out.print() method which instead prints only the argument passed to it.
* Tip 3: take advantage of a double nested loop.

Code
```java
package Lab02;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter number of rows in pattern: ");
		int num = Integer.parseInt(reader.nextLine());
		
		for (int i = 1; i < num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}

```

Output
```
Enter number of rows in pattern: 8
1 * 1 = 1	
2 * 1 = 2	2 * 2 = 4	
3 * 1 = 3	3 * 2 = 6	3 * 3 = 9	
4 * 1 = 4	4 * 2 = 8	4 * 3 = 12	4 * 4 = 16	
5 * 1 = 5	5 * 2 = 10	5 * 3 = 15	5 * 4 = 20	5 * 5 = 25	
6 * 1 = 6	6 * 2 = 12	6 * 3 = 18	6 * 4 = 24	6 * 5 = 30	6 * 6 = 36	
7 * 1 = 7	7 * 2 = 14	7 * 3 = 21	7 * 4 = 28	7 * 5 = 35	7 * 6 = 42	7 * 7 = 49	
```

## Question4
There are 30 or 31 days in a month except February. There are 28 days in February in a common year, and 29 days in a leap year. Write a program to input month by command line and show the days of this month using `switch`.

Sample output
```
Enter month number: 4
Number of days in 4 month is: 30
```

Code
```java
package Lab02;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Type a month: ");
		int month = Integer.parseInt(reader.nextLine());
		
		int days = 0;
		
		switch(month) { 
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			days = 31;
			System.out.println("until " + days + "th"); 
			break; 
		case 4: case 6: case 9: case 11: 
			days = 30;
			System.out.println("until " + days + "th"); 
			break; 
		case 2:
			days = 28;
			System.out.println("until " + days + "th"); 
			break;
		default: 
			days = 0;
			System.out.println("error!!!");
			break; 
		}
		System.out.println();
		
		if (days != 0) {
			System.out.println("Number of days in " + month + " is: " + days);
		} else {
			System.out.println("You have entered an invalid month!!!");
		}
	}
}

```

Output
```
Type a month: 2
until 28th

Number of days in 2 is: 28
```
```
Type a month: 1
until 31th

Number of days in 1 is: 31
```
```
Type a month: 4
until 30th

Number of days in 4 is: 30
```
```
Type a month: 0
error!!!

You have entered an invalid month!!!
```

## Question5
Type following code, try to create two arrays and use two different ways to print them.

Code
```java
package Lab02;

public class Task5 {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = new int[5];
		array2[0] = 6;
		array2[1] = 7;
		array2[2] = 8;
		array2[3] = 9;
		array2[4] = 10;
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}
		System.out.println();
		for (int e : array2) {
			System.out.print(e + "\t");
		}
		System.out.println();
	}
}
```

Output
```
1	2	3	4	5	
6	7	8	9	10
```

## Question6
Write a program to merge two arrays

* Let user input the array size,
* Let user input the two arrays,
* Output the result.
```
Enter the first array elements: 1
Enter the first array elements: 2
Enter the first array elements: 3
Enter the first array elements: 4
Enter the first array elements: 5
Enter the second array elements: 6
Enter the second array elements: 7
Enter the second array elements: 8
Enter the second array elements: 9
Enter the second array elements: 10
The resulted array is :
1 2 3 4 5 6 7 8 9 10
```

Code
```java
package Lab02;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the length of the fist array: ");
		int num1 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Enter the length of the second array: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		int[] first_arr = new int[num1];
		int[] sec_arr = new int[num2];
		int[] final_arr = new int[num1 + num2];
		
		for (int i = 0; i < num1; i++) {
			System.out.print("Enter the first array elements: ");
			first_arr[i] = Integer.parseInt(reader.nextLine());
		}
		
		for (int i = 0; i < num2; i++) {
			System.out.print("Enter the second array elements: ");
			sec_arr[i] = Integer.parseInt(reader.nextLine());
		}
		
		for (int i = 0; i < first_arr.length; i++) {
			final_arr[i] = first_arr[i];
		}
		
		for (int i = 0; i < sec_arr.length; i++) {
			final_arr[first_arr.length + i] = sec_arr[i];
		}
		
		for (int i = 0; i < final_arr.length; i++) {
			System.out.print(final_arr[i] + " ");
		}
	}
}
```
Output
```
Enter the length of the fist array: 2
Enter the length of the second array: 2
Enter the first array elements: 1
Enter the first array elements: 2
Enter the second array elements: 3
Enter the second array elements: 4
1 2 3 4
```

```java
package Lab02;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the length of the fist array: ");
		int num1 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Enter the length of the second array: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		int[] first_arr = new int[num1];
		int[] sec_arr = new int[num2];
		int[] final_arr = new int[num1 + num2];
		
		for (int i = 0; i < num1; i++) {
			System.out.print("Enter the first array elements: ");
			first_arr[i] = Integer.parseInt(reader.nextLine());
		}
		
		for (int i = 0; i < num2; i++) {
			System.out.print("Enter the second array elements: ");
			sec_arr[i] = Integer.parseInt(reader.nextLine());
		}
		
		System.arraycopy(first_arr, 0, final_arr, 0, num1);
		System.arraycopy(sec_arr, 0, final_arr, num1, num2);
		
		System.out.println("The resulted array is :");
		System.out.println(Arrays.toString(final_arr));
		}

	}
}

```
Output
```
Enter the length of the fist array: 2
Enter the length of the second array: 2
Enter the first array elements: 1
Enter the first array elements: 2
Enter the second array elements: 3
Enter the second array elements: 4
1 2 3 4 The resulted array is :
[1, 2, 3, 4]
```

Output
```
Enter the length of the fist array: 2
Enter the length of the second array: 2
Enter the first array elements: 1
Enter the first array elements: 2
Enter the second array elements: 3
Enter the second array elements: 4
1 2 3 4
```
