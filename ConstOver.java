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
		a=x;
		b=y;
		int c=a+b;
		System.out.println("\nThe sum of "+a+" and "+b+"="+c);
	}
	Add(Add ob)
	{
		a=ob.a;
		b=ob.b;
		int c=a+b;
		System.out.println("\nThe sum of "+a+" and "+b+"="+c);
	}

}
class ConstOver
{

	public static void main(String args[])
	{
		Add ob=new Add();
		Add ob1=new Add(5,6);
		Add ob2=new Add(ob1);
	}

}

