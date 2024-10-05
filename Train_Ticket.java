public class Train_Ticket implements Runnable{
	int a=10;
	int w;
	Train_Ticket(int i){
		w=i;
	}
	public void run() {
		System.out.println(a+" Tickets available");
		String name=Thread.currentThread().getName();
		if(a>w) {
			System.out.println(w+" Ticket Booked for "+name);
			try {
				Thread.sleep(2000000);
			}
			catch(InterruptedException o) {
				System.out.println("Exception "+o);
			}
			a=a-w;
		}
		else {
			System.out.println("No Ticket Available...");
		}
	}
	public static void main(String args[]) {
		Train_Ticket t=new Train_Ticket(11);
		Train_Ticket ti=new Train_Ticket(1);
		Thread tic=new Thread(t);
		Thread tick=new Thread(ti);
		tic.setName("Sourav Kumar Maity");
		tick.setName("Sourav_Maity");
		tic.start();
		tick.start();
	}
}