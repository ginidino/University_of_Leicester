package Lab04;

public class Circle2DTest {
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		
		System.out.println("The area of circle is " + c1.getArea());
		System.out.println("The  perimeter of the circle is " + c1.getPerimeter());
		System.out.println(c1.contains(3, 3));
		System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(c1.overlaps(new Circle2D(2, 2, 5.5)));
//		if (c1.contains(3, 3) == true) {
//			System.out.println("the specified point is inside this circle. ");
//		} else {
//			System.out.println("the specified point is not inside this circle. ");
//		}
//		if (c1.contains(new Circle2D(4, 5, 10.5)) == true) {
//			System.out.println("the specified circle is inside this circle.");
//		} else {
//			System.out.println("the specified circle is not inside this circle.");
//		}
//		if (c1.overlaps(new Circle2D(3, 5, 2.3)) == true) {
//			System.out.println("the specified circle overlaps with this circle.");
//		} else {
//			System.out.println("the specified circle does not overlaps with this circle.");
//		}
	}
}
