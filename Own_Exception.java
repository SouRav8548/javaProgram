class My_Exception extends Exception{
	public My_Exception(String s) {
	super(s);
	}
}
public class Own_Exception {
	public static void main(String args[]) {
		try {
			throw new My_Exception("Own Created Exception");
		}
		catch(My_Exception me) {
			System.out.println(me.getMessage());
		}
	}
}
