package Lab5;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter two characters: ");
			String ch = reader.nextLine();
			
			if (ch.isEmpty()) {
				break;
			}
			
			char major = ch.charAt(0);
			char status = ch.charAt(1);
			
			String majors = "";
			String stu = "";
			
			if (major == 'M') {
				majors = "Mathematics";
			} else if (major == 'C') {
				majors = "Computer Science";
			} else if (major == 'I') {
				majors = "Information Technology";
			}
			
			if (status == '1') {
				stu = "freshman";
			} else if (status == '2') {
				stu = "sophomore";
			} else if (status == '3') {
				stu = "junior";
			} else if (status == '4') {
				stu = "senior";
			}
			
			System.out.println(majors + " " + stu);
			System.out.println();
		}
	}
}
