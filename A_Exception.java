import java.util.*;
public class A_Exception {
	public static void main(String args[]) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Values of A&B:");
		a=s.nextInt();
		b=s.nextInt();
		try {
			int c=a/b;
			System.out.println("After Division c ="+c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}
