class M
{	
	public void display()
	{
		System.out.println("No parameters");
			
	}
	public void display(int a)
	{
		System.out.println("a="+a);
	}	
	public void display(int a,int b)
	{
		System.out.println("a="+a+" b="+b);
	}
	
}
class MethodOver
{
	public static void main(String args[])
	{
		M obj=new M();
		obj.display();
		obj.display(15);
		obj.display(20,25);
	
	}
}
