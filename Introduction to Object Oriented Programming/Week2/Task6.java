package Lab02;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the length of the fist array: ");
		int num1 = Integer.parseInt(reader.nextLine());
		
		System.out.print("Enter the length of the second array: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		int[] first_arr = new int[num1];
		int[] sec_arr = new int[num2];
		int[] final_arr = new int[num1 + num2];
		
		for (int i = 0; i < num1; i++) {
			System.out.print("Enter the first array elements: ");
			first_arr[i] = Integer.parseInt(reader.nextLine());
		}
		
		for (int i = 0; i < num2; i++) {
			System.out.print("Enter the second array elements: ");
			sec_arr[i] = Integer.parseInt(reader.nextLine());
		}
		
		for (int i = 0; i < first_arr.length; i++) {
			final_arr[i] = first_arr[i];
		}
		
		for (int i = 0; i < sec_arr.length; i++) {
			final_arr[first_arr.length + i] = sec_arr[i];
		}
		
		for (int i = 0; i < final_arr.length; i++) {
			System.out.print(final_arr[i] + " ");
		}
		
		System.arraycopy(first_arr, 0, final_arr, 0, num1);
		System.arraycopy(sec_arr, 0, final_arr, num1, num2);
		
		System.out.println("The resulted array is :");
		System.out.println(Arrays.toString(final_arr));
		
//		System.out.println("The resulted array is :");
//		for (int result : final_arr) {
//			System.out.println(result);
//		}
		/*System.out.print("Enter the number: ");
		int maxNum = Integer.parseInt(reader.nextLine());
		System.out.println();
		
		int[] values = new int[maxNum];
		int[] values1 = new int[maxNum];
		int numValue = 0;
		
		System.out.println("Enter the first array elements: ");
		int num1 = Integer.parseInt(reader.nextLine());
		
		for (int i = 0; i < maxNum; i++) {
			values[numValue++] = num1;
			System.out.println("Enter the first array elements: ");
			num1 = Integer.parseInt(reader.nextLine());
		}
		
		System.out.println("Enter the first array elements: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		for (int j = 0; j < maxNum; j++) {
			values1[numValue++] = num2;
			System.out.println("Enter the first array elements: ");
			num2 = Integer.parseInt(reader.nextLine());
		}
		
		for (int x = 0; x < numValue; x++) {
			System.out.print(values[x] + " " + values1[x] + " ");
		}
		
		while (numValue <= maxNum) {
			values[numValue++] = num1;
			System.out.println("Enter the first array elements: ");
			num1 = Integer.parseInt(reader.nextLine());
			numValue++;
		}
		
		System.out.println("Enter the second array elements: ");
		int num2 = Integer.parseInt(reader.nextLine());
		
		while (numValue <= maxNum) {
			values[numValue++] = num2;
			System.out.println("Enter the second array elements: ");
			num2 = Integer.parseInt(reader.nextLine());
			numValue++;
		} 
		
		System.out.println("The values entered were: ");

		for (int i = 0; i < numValue; i++) {
			System.out.print(values[i] + " ");
		}*/
	}
}
