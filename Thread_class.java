public class Thread_class extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("thread...."+i);
		}
	}
	public static void main(String args[]){
		Thread_class obj=new Thread_class();
		Thread_class ob=new Thread_class();
		obj.start();
		ob.start();
	}
}