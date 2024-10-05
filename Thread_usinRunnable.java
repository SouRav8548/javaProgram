class Thread_Using_Runnable implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("thread...."+i);
		}
	}
	public static void main(String args[]){
		Thread_Using_Runnable object =new Thread_Using_Runnable();
		Thread obj=new Thread();
		obj.start();
	}
}