class P
{

	int a,b;
	P(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("\n The result= "+(a+b));
	}	
}
class ParConst
{

	public static void main(String args[])
	{
		P ob=new P(5,6);
	}

}

