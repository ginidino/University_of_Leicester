package Lab04;

public class Engine {
	private String model;
	private int weight;
	private String color;
	private int price;
	
	public Engine(String model, int weight, String color, int price) {
		this.model = model;
		this.weight = weight;
		this.color = color;
		this.price = price;
	}
	
	public Engine(String rpm, int weight, String silver) {
		
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
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
}
