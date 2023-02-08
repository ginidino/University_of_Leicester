package Lab03;

public class Task3_UserTest {
	public static void main(String[] args) {
		User first = new User();
		first.setAccountNum("1444-4345-4423-2322");
		first.setBalance(499);
		first.introduce();
		System.out.println(first.getAccountNum() + " Account has initial balance of " + first.getBalance());
		first.deposit(500);
		System.out.println(first.getAccountNum() + " Account balance after deposit is " + first.getBalance());
		first.withdraw(34);
		System.out.println(first.getAccountNum() + " Account balance after withdrawn is " + first.getBalance());
	}
}
