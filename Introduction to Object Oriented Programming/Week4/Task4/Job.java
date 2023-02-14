package Lab04;

public class Job {
	private String role;
	private long salary;
	private int id;

	public Job(String role, long salary, int id) {
		this.role = role;
		this.salary = salary;
		this.id = id;
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public long getSalary() {
		return this.salary;
	}
	
	public String getRole() {
		return role;
	}
}