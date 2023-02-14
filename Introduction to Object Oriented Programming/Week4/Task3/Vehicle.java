package Lab04;

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

