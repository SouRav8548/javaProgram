import java.util.Scanner;
class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}
public class UserDefinedException {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		try {
			if (age < 18)
				throw new MyException("Not Eligible to vote.");
			else
				System.out.println("Eligible to vote.");
		}
		catch (MyException ex) {
			//System.out.println("Caught Exception");
			System.out.println(ex.getMessage());
		}
	}
}