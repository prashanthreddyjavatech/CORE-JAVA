package multithreading;

 class MyThread extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			Thread.yield();
			System.out.println("Child Thread");
		}
	}

}
 
 public class YieldMethodEx{
	 public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread");
		}
	}
 }
