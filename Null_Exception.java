public class Null_Exception {
	public static void main(String args[]) {
		try {
			String n1=null;
			System.out.println(n1.length());
		}
		catch(NullPointerException ex) {
			System.out.println(ex);
		}
	}
}
