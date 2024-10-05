class S
{
		static int a=3;
		public  void check()
		{
			System.out.println("The current value of a: "+a++);
		}
}
class StVariable
{
		public static void main(String args[])
		{
			S ob=new S();
			ob.check();
			S ob1=new S();
			ob1.check();
			S ob2=new S();
			ob2.check();
		}
	}
