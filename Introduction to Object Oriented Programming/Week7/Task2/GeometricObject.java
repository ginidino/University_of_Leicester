package Lab07_Test;

public abstract class GeometricObject {
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public abstract String getColor();
	
	public abstract boolean isFilled();
}
class Triangle extends GeometricObject {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private String color = "white";
	private boolean filled;

	public Triangle(double side1, double side2, double side3, String color, boolean filled) { 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.color = color;
		this.filled = filled;
	}

	public double getSide1() {
		return this.side1;
	}

	public double getSide2() {
		return this.side2;
	}

	public double getSide3() {
		return this.side3;
	}
	
	@Override
	public double getArea() {
		double s = (this.side1 + this.side2 + this.side3) / 2;
		return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
	}
	
	@Override
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public boolean isFilled() {
		return this.filled;
	}
	
	@Override
	public String toString() {
		return "Triangle: side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " + this.side3 + "\nArea: " + this.getArea() 
		+ "\nPerimeter: " + this.getPerimeter() + "\nColor: " + this.color + "\nFilled: " + this.filled;
	}
}
