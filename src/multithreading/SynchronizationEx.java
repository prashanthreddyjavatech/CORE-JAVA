package multithreading;

public class SynchronizationEx {

	public static final int noc = 5;

	public static void main(String[] args) {
		Account ac=new Account();
		Customer cu[]=new Customer[noc];
		for(int i=0;i<noc;i++) {
			cu[i]=new Customer(ac);
		}
		for(int i=0;i<noc;i++) {
			cu[i].start();
		}

		try {
			for (int i = 0; i < noc; i++) {
				cu[i].join();
			}
		} catch (InterruptedException ie) {

		}
	
		System.out.println("total balance is :"+ac.getBal());
		}
	}
	


class Account{
	private int bal=0;
	synchronized void deposit(int amt) {
		bal=bal+amt;
		System.out.println("Current balance:"+bal);
	}
	
	public int getBal() {
		return bal;
	}
		
}

class  Customer extends Thread{
	Account ac;
	Customer(Account ac){
		this.ac=ac;
	}
	public void run() {
		ac.deposit(100);
	}
}


