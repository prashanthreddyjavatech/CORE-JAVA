package multithreading;

public class RunnableEx implements Runnable {
	public void run() {
		System.out.println("thread running started...");
	}

	public static void main(String args[]) {
		RunnableEx r = new RunnableEx();
		Thread t1 = new Thread(r);
		t1.start();
	}
}