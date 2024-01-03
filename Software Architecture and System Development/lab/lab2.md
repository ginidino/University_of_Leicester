# Lab2

## Task1
1. Projectnamelab2_exA_task01:
Print YOUR_NAME: dd-MM-yyyy on the output console using System.out.println, where YOUR_NAME should be your name (or your team's name) and dd-MM-yyyy should be replaced by today's date using that format pattern (for example: 07-10- 2022). Hint: you may want to adapt this example.
```java
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class lab2EX_1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = reader.nextLine();
        //System.out.println();

        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        String current = null;

        try {
            current = date.format(new Date());
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(name + " " + current);
    }
}
```

## Task2
Projectnamelab2_exA_task02:
Use a loop for printing the members of the following collection ["orange","banana","coconut"]:
1. CreateanArrayListwiththeseelements.
        
2. Program a loop that traverses the list and prints each word to the output console.
```java
import java.util.ArrayList;

public class lab2EX_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("orange");
        list.add("banana");
        list.add("coconut");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
```

## Task3
Projectnamelab2_exA_task03:
Determine the average of all the integer numbers in a list.
1. CreateanArrayListandinitializewith[1,2,3,4,5,6,7,8,9,10]
2. Program a loop that computes the average: sum all the elements up and then divide by the number of elements in the list.
3. Print the average (a float value) on the output console.
4. Check your logic by changing the given list of numbers.
```java
package lab2_exA;

import java.util.ArrayList;

public class lab2_exA_task03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        float average = (float) sum / list.size();
        System.out.println("Average: " + average);
    }
}

```

## Task4
Projectnamelab2_exA_task04:
Check whether the list ["orange","banana","coconut"] contains the word banana:
1. CreateanArrayListandinitializewiththeelements ["orange","banana","coconut"]
2. UseanappropriatemethodfromtheCollectioninterface(codecompletion can show the possibilities; follow the Java Collections Framework link for relevant documentation).
3. Print the result in the output console as either found or not found.
```java
package lab2_exA;

import java.util.ArrayList;

public class lab2_exA_task04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("orange");
        list.add("banana");
        list.add("coconut");

        if (list.contains("banana")) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
```

## Task5
Projectnamelab2_exA_task05:
Check whether all the words in the list ["orange","banana","coconut"] contain the letter n:
1. CreateanArrayListandinitializewiththeelements ["orange","banana","coconut"]
2. Create a loop and use the appropriate method from the String class to implement the property to be asserted (whether the word contains the given letter).
3. Inside the loop, print the result in the output console, e.g. found or fruit X does not contain the letter n.
4. Check your logic by changing the given list of words.
```java
import java.util.ArrayList;

public class lab2EX_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("orange");
        list.add("banana");
        list.add("coconut");

        for (String fruit : list) {
            if (fruit.contains("n")) {
                System.out.println("The fruit " + fruit + " contains the letter n");
            } else {
                System.out.println("The fruit " + fruit + " does not contains the letter n");
            }
        }
    }
}
```
