public class Nested_Try_Block_question19 {
	public static void main(String args[]) {
		try {
			int a=10,b=0;
			int c=a/b;
			System.out.println("After Division..........."+c);
			try {
				String st=null;
				System.out.println(st.length());
			}
			catch(NullPointerException npe) {
				System.out.println(npe);
			}
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
	}
}
