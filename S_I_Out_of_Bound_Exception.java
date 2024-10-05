public class S_I_Out_of_Bound_Exception {
	public static void main(String args[]) {
		String st="Sourav is a very bad boy";
		try {
			char c=st.charAt(6);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println(ex);
		}
	}
}
