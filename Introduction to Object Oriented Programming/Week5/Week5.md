# Week5
The goal of these exercises is to gain practice with `Strings`, `Static` `variables`, `Constants`, and `Methods`.

## Question 1
(Student major and status) Write a program that prompts the user to enter two characters and displays the major and status represented in the characters. The first character indicates the major and the second is number character 1, 2, 3, 4, which indicates whether a student is a freshman, sophomore, junior, or senior. Suppose the following chracters are used to denote the majors:
  * M: Mathematics
  * C: Computer Science
  * I: Information Technology

Here is sample run:
```
Enter two characters: M1
Mathematics Freshman
Enter two characters: C3
Computer Science Junior
```

Code
```java
package Lab5;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter two characters: ");
			String ch = reader.nextLine();
			
			if (ch.isEmpty()) {
				break;
			}
			
			char major = ch.charAt(0);
			char status = ch.charAt(1);
			
			String majors = "";
			String stu = "";
			
			if (major == 'M') {
				majors = "Mathematics";
			} else if (major == 'C') {
				majors = "Computer Science";
			} else if (major == 'I') {
				majors = "Information Technology";
			}
			
			if (status == '1') {
				stu = "freshman";
			} else if (status == '2') {
				stu = "sophomore";
			} else if (status == '3') {
				stu = "junior";
			} else if (status == '4') {
				stu = "senior";
			}
			
			System.out.println(majors + " " + stu);
			System.out.println();
		}
	}
}

```
Output
```
Enter two characters: M1
Mathematics Freshman
Enter two characters: C3
Computer Science Junior
```

## Question 2
Write a program to remove all repeated characters in a string provided by the user and return a new string without any repeating characters. Please use `StringBuilder` to build the new string.

Sample runs:
```
Please type a string: hello
After removing repeating chars and spaces: helo

Please type a string: abcd bcde cdef
After removing repeating chars: abcd ef
```

Code
```java
package Lab5;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			System.out.print("Please type a string: ");
			String type = reader.nextLine();
			
			if (type.isEmpty()) {
				break;
			}
			
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < type.length(); i++) {
				char c = type.charAt(i);
				if (sb.indexOf(Character.toString(c)) == -1) {
	                sb.append(c);
	            }
			}
			
			System.out.println("After removing repeating chars and spaces: " + sb.toString());
			System.out.println();
		}
	}
}

```
Output
```
Please type a string: hello
After removing repeating chars and spaces: helo

Please type a string: abcd bcde cdef
After removing repeating chars: abcd ef
```

## Question 3
Write a program that prompts the user to enter two strings and reports whether the second string is a substring of the first string.
```
Enter string s1: ABCD
Enter string s2: BC
BC is a substring of ABCD
Enter string s1: ABCD
Enter string s2: BDC
BDC is not a substring of ABCD
```

Code
```java
package Lab5;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter string s1: ");
			String s1 = reader.nextLine();
			
			System.out.print("Enter string s2: ");
			String s2 = reader.nextLine();
			
			/*if (s1.contains(s2)) {
	            System.out.println(s2 + " is a substring of " + s1);
	            System.out.println();
	        } else {
	            System.out.println(s2 + " is not a substring of " + s1);
	            System.out.println();
	            break;
	        }*/
			
			if (s1.indexOf(s2) == -1) {
				System.out.println(s2 + " is not a substring of " + s1);
				System.out.println();
				break;
			} else {
				System.out.println(s2 + " is a substring of " + s1);
	            System.out.println();
			}
		}
	}
}

```
Output
```
Enter string s1: ABCD
Enter string s2: BC
BC is a substring of ABCD
Enter string s1: ABCD
Enter string s2: BDC
BDC is not a substring of ABCD
```

## Question 4
Design a class named `Fan` to represent a fan. The class contains:
  * Three constants named **SLOW**, **MEDIUM**, and **FAST** with the values 1, 2, and 3 to denote the fan speed.
  * A private int data field named speed that specifies the speed of the fan (the default is SLOW).
  * A private boolean data field named on that specifies whether the fan is on (the default is false).
  * A private double data field named radius that specifies the radius of the fan (the default is 5).
  * A string data field named color that specifies the color of the fan (the default is blue).
  * The accessor and mutator methods for all four data fields.
  * A no-arg constructor that creates a default fan.
  * A method named `toString()` that returns a string description for the fan. If the fan is on, the method returns the fan speed, color, and radius in one combined string. If the fan is not on, the method returns the fan color and radius along with the string “fan is off” in one combined string.

Code
```java
package Lab5;

public class Fan {
	static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    public Fan() {
    	this.speed = SLOW;
    	this.on = false;
    	this.radius = 5;
    	this.color = "blue";
    }
    
    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        if (this.on) {
            return "Speed: " + this.speed + ", Color: " + this.color + ", Radius: " + this.radius;
        } else {
            return "Color: " + this.color + ", Radius: " + this.radius + ", Fan is off";
        }
    }
}

```
```java
package Lab5;

public class Task4 {
	public static void main(String[] args) {
		Fan fan = new Fan();
		
		System.out.println(fan); 
		System.out.println();

		fan.setSpeed(Fan.FAST);
		fan.setOn(true);
		fan.setRadius(10.0);
		fan.setColor("yellow");
		System.out.println(fan); 
		System.out.println();
		
		fan.setOn(false);
		fan.setColor("Red");
		fan.setSpeed(Fan.MEDIUM);
		fan.setRadius(20.2);
		System.out.println(fan);
	}
}
```
Output
```
Color: blue, Radius: 5.0, Fan is off

Speed: 3, Color: yellow, Radius: 10.0

Color: Red, Radius: 20.2, Fan is off
```
