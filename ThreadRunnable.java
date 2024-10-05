public class ThreadRunnable implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("thread...."+i);
		}
	}
	public static void main(String args[]){
		ThreadRunnable object =new ThreadRunnable();
		Thread obj=new Thread(object);
		obj.start();
	}
}
