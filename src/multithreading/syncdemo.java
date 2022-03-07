package multithreading;

public class syncdemo extends Thread {
	static int i=0;
	public void run() {
	
		System.out.println(increament());
		
	}
	
	public static void main(String[] args) {
		syncdemo t1=new syncdemo();
		syncdemo t2=new syncdemo();
		syncdemo t3=new syncdemo();
		t1.start();
		t2.start();
		t3.start();
	}
	
	   int increament() {
	      i=i+1;
	      return i;
	      
	}
	

}
