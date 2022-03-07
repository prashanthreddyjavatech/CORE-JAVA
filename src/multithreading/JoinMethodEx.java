package multithreading;

public class JoinMethodEx extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		JoinMethodEx e1=new JoinMethodEx();
		JoinMethodEx e2=new JoinMethodEx();
		JoinMethodEx e3=new JoinMethodEx();
		e1.start();
		try {
			e1.join();
		} catch (InterruptedException e) {
			
		}
		e2.start();
		e3.start();
	}

}
