# Week9 Lab

The GenericStack class encapsulates the stack storage and provides the operations for manipulating the stack.
```java
import java.util.ArrayList;

public class GenericStack<E> {
  private ArrayList<E> list = new ArrayList<>();
  private int size = 0;
  
  public int getSize() {
    return list.size();
  }
  
  public E peek() {
    return list.get(getSize() - 1);
  }
  
  public void push(E o) {
    list.add(o);
  }
  
  public E pop() {
    E o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }
  
  public boolean isEmpty() {
    return list.isEmpty();
  }
  
  @Override
  public String toString() {
    return "stack: " + list.toString();
  }
}
```

## Task1
In section 1, GenericStack is implemented using composition. Define a new stack class that extends ArrayList.

Write a test program that prompts the user to enter five strings and displays them in reverse order.

Code
```java
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		GenericStack2<String> stack3 = new GenericStack2<>();
        
        while (true) {
        	System.out.print("Enter the five String: ");
        	String word = reader.nextLine();
        	
        	if (word.isEmpty()) {
        		break;
        	} else {
        		stack3.push(word);
        	}
        }
        System.out.println();
        int size = stack3.getSize();
        System.out.println("The strings in reverse order are: ");
    	for (int i = 0; i < size; i++) {
    		System.out.print(stack3.pop() + " ");
    	}
	}
}
```
```java
import java.util.ArrayList;

public class GenericStack<E> {
	private ArrayList<E> list = new ArrayList<>();
	private int size = 0;
	
	public int getSize() {
		return this.size;
	}
	
	public E peek() {
		return list.get(getSize() - 1);
	}
	
	public void push(E o) {
		list.add(o);
	}
	
	public E pop() {
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}
```
```java
import java.util.ArrayList;

public class GenericStack2<E> extends ArrayList<E> {
	
	public int getSize() {
		return super.size();
	}
	
	public E peak() {
		return super.get(getSize() - 1);
	}
	
	public void push(E o) {
		super.add(o);
	}

	public E pop() {
		E o = super.get(getSize() - 1);
		super.remove(super.get(getSize() - 1));
		return o;
	}
	
	public boolean isEmpty() {
        return super.isEmpty();
    }
}
```
Output
```
Enter the five String: 1
Enter the five String: 2
Enter the five String: 3
Enter the five String: 4
Enter the five String: 5
Enter the five String: 

The strings in reverse order are: 
5 4 3 2 1
```

## Task2
Create an `abstract Fruit class` that defines an encapsulated weight variable. For our program a fruit object without weight makes no sense.
  * Create the `subclasses Apple, Peach and Orange`.
  * Create a `generic class Basket` that abstracts the concept of fruit basket. This defines an *array list* of fruits.
  * He must also expose a `getWeight()` method which returns the total weight of the contents of the basket; an `add()` method to add one fruit at a time, which raises an exception in case the addition of the fruit you want to add makes it exceed the maximum limit of 5 kilos in weight.
  * Each basket must have only one type of fruit at a time.
Implement a solution with generics. Create a test class to verify the actual operation of the program.

Code
```java
public class Apple extends Fruit {

	public Apple(double weight) {
		super(weight);
	}
}
```
```java
public class Orange extends Fruit {

	public Orange(double weight) {
		super(weight);
	}
}
```
```java
public class Peach extends Fruit {

	public Peach(double weight) {
		super(weight);
	}
}
```
```java
public class Basket<T> {
	private ArrayList<Fruit> fruits;
	private double maxWeight;
	
	public Basket() {
		this.fruits = new ArrayList<>();
		this.maxWeight = 5;
	}
	
	public double getWeight() {
		double total = 0;
		
		for (Fruit fruit : fruits) {
			total += fruit.getWeight();
		}
		return total;
	}
	
	public void add(Fruit fruit) throws Exception {
		if (this.getWeight() + fruit.getWeight() > this.maxWeight) {
			throw new Exception("Basket is full!");
		}
		this.fruits.add(fruit);
	}
}
```
```java
public abstract class Fruit {
	private double weight;
	
	public Fruit(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
```
```java
public class Task2 {
	public static void main(String[] args) {
		try {
			Basket<Apple> apple = new Basket<>();
            apple.add(new Apple(0.5));
            apple.add(new Apple(0.6));
            System.out.println("Apple basket weight: " + apple.getWeight());

            Basket<Peach> peach = new Basket<>();
            peach.add(new Peach(1.2));
            peach.add(new Peach(1.5));
            System.out.println("Peach basket weight: " + peach.getWeight());

            Basket<Orange> orange = new Basket<>();
            orange.add(new Orange(0.8));
            orange.add(new Orange(1.0));
            System.out.println("Orange basket weight: " + orange.getWeight());
            
            System.out.println();
            apple.add(new Apple(4.0));
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
```
Output
```
Apple basket weight: 1.1
Peach basket weight: 2.7
Orange basket weight: 1.8

Basket is full!
```
