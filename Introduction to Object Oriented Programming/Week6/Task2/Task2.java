package Lab06;

import java.util.Date;

public class Task2 {
    public static void main(String[] args) {
        Person person = new Person("injae Lee", "162 London Road", "7541548927", "il74@student.le.ac.uk");
        System.out.println(person);
        System.out.println();
        
        Student student = new Student("injae Lee", "162 London Road", "7541548927", "il74@student.le.ac.uk", Student.FRESHMAN);
        System.out.println(student);
        System.out.println();
        
        Employee employee = new Employee("Kim", "30 Staniforth St", "010-1234-1234", "kim@email.com", "123", 50000.0, new Date());
        System.out.println(employee);
        System.out.println();
        
        Faculty faculty = new Faculty("Lee", "495 Bristol Rd", "010-1234-1234", "lee@email.com", "456", 75000.0, new Date(), "9am-5pm", "Professor");
        System.out.println(faculty);
        System.out.println();
        
        Staff staff = new Staff("Han", "Manor Rd", "010-1234-1234", "tom@email.com", "789", 40000.0, new Date(), "Administrative Assistant");
        System.out.println(staff);
    }
}
