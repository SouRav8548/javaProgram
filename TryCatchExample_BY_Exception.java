public class TryCatchExample_BY_Exception {
	public static void main(String[] args) {
		String s="Sourav maity";
		try{
			int stelength=s.length();
			System.out.println("String Length ........"+stelength);
			try{
				int data=50/0;
				System.out.println("Divided......= "+data);//may throw exception 
			}
			catch(ArithmeticException ex) {
				System.out.println("inner catch");
				System.out.println(ex.getMessage());
			}
		}
		catch(NullPointerException e){
			System.out.println("null pointer Exception  "+e.getMessage());
		}
	}
}