package Lab03;

public class Task3_Person {
	public static void main(String[] args) {
//		Person person1 = new Person("Brian", "Pekka", 20);
//		Person person2 = new Person("injae", "Lee", 25);
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.setName("Brian");
		person1.setSurname("Pekka");
		person1.setAge(24);
		
		person2.setName("injae");
		person2.setSurname("Lee");
		person2.setAge(24);
		
		System.out.println(person1.details());
		System.out.println(person2.details());
		
		Person person3 = person2;
		System.out.println(person3.details());
	}
}
