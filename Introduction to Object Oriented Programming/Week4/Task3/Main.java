package Lab04;

public class Main {
	public static void main(String[] args) {
		Engine engine = new Engine("high", 24, "silver", 40);
		Vehicle benz = new Vehicle("benz", "black", 200, 4, engine);
		System.out.println("I have a " + benz.getColor() + " " + benz.getName());
		System.out.println("With a weight of " + benz.getEngine().getWeight() + " TONNES");
		System.out.println("The Price is " + engine.getPrice());
	}
}
