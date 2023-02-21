package Lab5;

public class Task4 {
	public static void main(String[] args) {
		Fan fan = new Fan();
		
		System.out.println(fan); 
		System.out.println();

		fan.setSpeed(Fan.FAST);
		fan.setOn(true);
		fan.setRadius(10.0);
		fan.setColor("yellow");
		System.out.println(fan); 
		System.out.println();
		
		fan.setOn(false);
		fan.setColor("Red");
		fan.setSpeed(Fan.MEDIUM);
		fan.setRadius(20.2);
		System.out.println(fan);
	}
}