class ThreadDemo extends Thread {
public void run(){
System.out.println("Inside run method");
}
public static void main(String[] args) {
ThreadDemo t1 = new ThreadDemo();
ThreadDemo t2 = new ThreadDemo();
ThreadDemo t3 = new ThreadDemo();
// Display the priority of above threads
System.out.println("t1 thread priority : "+ t1.getPriority());
System.out.println("t2 thread priority : "+ t2.getPriority());
System.out.println("t3 thread priority : "+ t3.getPriority());
t1.setPriority(2);
t2.setPriority(5);
t3.setPriority(8);
// t3.setPriority(21); will throw IllegalArgumentException
System.out.println("t1 thread priority : "+ t1.getPriority());
System.out.println("t2 thread priority : "+ t2.getPriority());
System.out.println("t3 thread priority : "+ t3.getPriority());
// Displays the name of currently executing Thread
System.out.println("Currently Executing Thread : "+ Thread.currentThread().getName());
System.out.println("Main thread priority : "+ Thread.currentThread().getPriority());
}
}