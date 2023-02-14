package Lab04;

public class Circle2D {
	private int x;
	private int y;
	private double radius;
	
	public Circle2D(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	public double getPerimeter() {
		return 2 * this.radius * Math.PI;
	}
	
	public boolean contains(double x, double y){
//		double distance = Math.pow(getX() - x, 2) + Math.pow(getY() - y, 2);
//		if (distance <= Math.pow(radius, 2)) {
//			return true;
//		} else {
//			return false;
//		}	
		return Math.sqrt(Math.pow(x - this.x, 2) +  Math.pow(y - this.y, 2)) < radius;
	}
	
	public boolean contains(Circle2D circle){
//		double distance = Math.pow(circle.x - getX(), 2) + Math.pow(circle.y - getY(), 2);
//		if (distance <= (Math.pow(radius, 2) - Math.pow(circle.radius, 2))) {
//			return true;
//		} else {
//			return false;
//		}
		return Math.sqrt(Math.pow(circle.getX() - x, 2) +  Math.pow(circle.getY() - y, 2)) <= Math.abs(radius - circle.getRadius());
	}
	
	public boolean overlaps(Circle2D circle){
//		double distance = Math.pow(circle.x - getX(), 2.0) + Math.pow(circle.y - getY(), 2.0);
//		if (distance > Math.abs(Math.pow(radius, 2.0) - Math.pow(circle.radius, 2.0))) {
//			return true;
//		} else {
//			return false;
//		}
		return Math.sqrt(Math.pow(circle.getX() - x, 2) +  Math.pow(circle.getY() - y, 2)) >= radius + circle.getRadius();
	}
}
