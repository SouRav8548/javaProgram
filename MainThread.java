class ThreadA extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("ThreadA -"+i);
		}
		System.out.println("Exiting ThreadA");
	}
}
class ThreadB extends Thread{
	public void run(){
		for(int j=1;j<=5;j++){
			System.out.println("ThreadB -"+j);
		}
		System.out.println("Exiting ThreadB");
	}
}
class ThreadC extends Thread{
	public void run(){
		for(int k=1;k<=5;k++){
			System.out.println("ThreadC -"+k);
		}
		System.out.println("Exiting ThreadC");
	}
}
class MainThread{
	public static void main(String [] args){
		ThreadA tA=new ThreadA();
		ThreadB tB=new ThreadB();
		ThreadC tC=new ThreadC();
		tA.start();
		tB.start();
		tC.start();
		//new ThreadA().start();
		//new ThreadA().run();
	}
}