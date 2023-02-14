package Lab04;

public class Contact {
	private String name;
	private String add;
	private String phoneNumber;
	
	public Contact(String name, String num) {
		this.name = name;
		this.phoneNumber = num;
	}
	
	public Contact(String name, String add, String num) {
		this.name = name;
		this.add = add;
		this.phoneNumber = num;
	}
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.add;
	}
	
	public String getNum() {
		return this.phoneNumber;
	}
	
	public void printDetails() {
		System.out.println(this.getName() + "\n" + this.getAddress() + "\n" + this.getNum());
	}
}
