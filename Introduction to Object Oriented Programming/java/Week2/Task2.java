package Lab02;

public class Task2 {
	public static void main(String[] args) {
		int counter = 0;
		int num = 0;
		
		while (true) {
			if (counter == 5) {
				break;
			}
			
			if (num % 2 == 0) {
				System.out.print(num + " ");
				counter++;
				num++;
				continue;
			} 
				num++;
				
			
		}
	}
}
