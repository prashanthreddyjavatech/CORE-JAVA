package multithreading;

public class NamingThreadEx extends Thread {
	public void run(){  
		   System.out.println("Thread runniing");  
		  }  
		 public static void main(String args[]){  
		  NamingThreadEx t1=new NamingThreadEx();  
		  NamingThreadEx t2=new NamingThreadEx();  
		  System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());  
		   
		  t1.start();  
		  t2.start();  
		  
		  t1.setName("testhread");  
		  System.out.println("After changing name of t1:"+t1.getName());  
		 } 

}
