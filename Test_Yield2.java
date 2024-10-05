class T extends Thread {
	synchronized public void run() {
		System.out.println("Yield....program...");
		for(int i=0;i<8;i++) {
			if(i==3)
			Thread.yield();
			System.out.println("dfgh."+i);
		}
	}
}
public class Test_Yield2 extends Thread {
	synchronized public void run() {
		System.out.println("This thread program is completed...");
		for(int j=0;j<9;j++) {
			if(j==4) {
				System.out.println("In class no.2...."+j);
			}
		}
	}
	public static void main(String args[]) {
		T obj = new T();
		Test_Yield2 obj2=new Test_Yield2();
		obj.start();
		obj2.start();
	}
}