class Add
{
		int a,b;	

		Add()
		{
			a=2;
			b=4;
			int c=a+b;
			System.out.println("\nThe sum of "+a+" and "+b+"="+c);	
		}
		Add(int x,int y)
		{	
			this();
			a=x;
			b=y;
			int c=a+b;
			System.out.println("\nThe sum of "+a+" and "+b+"="+c);
		}
		Add(int x,int y,int z)
		{
			this(7,8);	
			a=x+y;
			b=z;
			int c=a+b;
			System.out.println("\nThe sum of "+a+" and "+b+"="+c);
		}
}
class thisM
{
		public static void main(String args[])
		{
			Add ob=new Add(5,6,7);	
		}	
}
