class ThreadA extends Thread{
	public void run(){
		for(int i =1; i<=5;i++){
			System.out.println("ThraedA - "+i);
			try{Thread.sleep(1000);}
			catch(Exception o){}
		}
	}
}
class MultipleThread{
	public static void main(String args[]){
		ThreadA mt1 = new ThreadA();
		//ThreadA mt2 = new ThreadA();
		mt1.start();	
		//mt2.start();
	}
}