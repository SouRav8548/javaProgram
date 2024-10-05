public class TryCatchExample5 {

	public static void main(String[] args) {
		try
		{
		int data=50/0;
		System.out.println("Divided......= "+data);//may throw exception 
		}
             // handling the exception
		catch(Exception e)
		{
                  // displaying the custom message
			System.out.println(e);
		}
	}
	
}