import java.util.ArrayList;

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

class Apple extends Fruit {

	public Apple(double weight) {
		super(weight);
	}
}

class Orange extends Fruit {

	public Orange(double weight) {
		super(weight);
	}
}

class Peach extends Fruit {

	public Peach(double weight) {
		super(weight);
	}
}

abstract class Fruit {
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

class Basket<T> {
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
