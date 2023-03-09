package Lab07_Test;

public abstract class Shape {

	public abstract double RectangleArea(double len, double bre);
	
	public abstract double SquareArea(double side);
	
	public abstract double CircleArea(double rad);

}

class Area extends Shape {

	@Override
	public double RectangleArea(double len, double bre) {
		return len * bre;
	}

	@Override
	public double SquareArea(double side) {
		return side * side;
	}

	@Override
	public double CircleArea(double rad) {
		return Math.PI * rad * rad;
	}
}
