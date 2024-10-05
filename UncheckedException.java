import java.util.Scanner;
class MyException extends Exception{
	public MyException(String str){
		super(str);
	}
}
class UncheckedException{
			public static void main(String [] args){
			//int a=6, b=0;
		//	int c=a/b;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your age :");
			int age = sc.nextInt();
			try{
			if(age <18)
				throw new MyException("You are not Eligible for Vote.");
			else
				System.out.println("You are Eligible for vote.");
			}
			catch(MyException me){
				System.out.println(me.getMessage());
			}
		}
	
	}	
