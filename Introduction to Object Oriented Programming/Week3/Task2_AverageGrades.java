package Lab03;

import java.util.Scanner;

public class Task2_AverageGrades {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int[] grades = new int[20];
		System.out.println("Enter the number, negative number completes:");
		int x = 0;
		for (int i = 0; i < grades.length; i++) {
			System.out.print("Enter your grade: ");
			String num = reader.nextLine();
			int theGrade = Integer.parseInt(num);
			if (theGrade < 0) {
				break;
			} else {
				grades[i] = Integer.parseInt(num);
			}
			x++;
		}
		System.out.println("Acceptance percentage: " + Average(grades, x));
	}
	
	public static double Average(int grades[], int x) {
		int sum = 0;
		for (int num : grades) {
			sum += num;
		}
		return (double) sum / x;
		/*double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
			
		}
		return sum / grades.length;*/
	}
}
