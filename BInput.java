import java.io.*;
class BInput
{
public static void main(String args[])throws IOException
		{
			int a;
			float b;
			System.out.println("Enter the value of a:");
			InputStreamReader ob=new InputStreamReader(System.in);
			BufferedReader ob1=new BufferedReader(ob);
			a=Integer.parseInt(ob1.readLine());
			System.out.println("Enter the value of b:");
			b=Float.parseFloat(ob1.readLine());
			System.out.println("The value of a="+a);
			System.out.println("The value of a="+b);
		}
	}
