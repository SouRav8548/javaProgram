public class Using_Yield extends Thread  
{  
	public void run()  
	{  
		for (int i=0; i<3 ; i++)  
			System.out.println(Thread.currentThread().getName() + " in control");  
	}  
	public static void main(String[]args)  
	{  
		//Thread obj=new Thread();
		Using_Yield t1 = new Using_Yield();  
		Using_Yield t2 = new Using_Yield();  
		t1.start();  // this will call run() method  
		t2.start();  
		for (int i=0; i<3; i++)  
		{  
			Thread.yield();   // Control passes to child thread  
			System.out.println(Thread.currentThread().getName() + " in control");  
		}  
	}  
}