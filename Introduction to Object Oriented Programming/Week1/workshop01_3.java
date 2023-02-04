package Lab01;

public class workshop01_3 {
	public static void main(String[] args) {
		double a = 5;
		double b = 3;
		
		double r1 = a / b;
		System.out.println("The division of " + a + " and " + b + " is " + r1);
		
		char c = 'a';
		short s = 5000;
		
		int r2 = c * s;
		System.out.println("The multiplication of " + c + " and " + s + " is " + r2);
		
		int r3 = 400;
		
		double r4  = r1 - r2 - r3;
		System.out.println("The subtraction of " + r1 + ", " + r2 + " and " + r3 + " is " + r4);
	}
}
