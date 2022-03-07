package multithreading;

public class DaemonThreadEx extends Thread{
	 public void run(){  
		  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
		   System.out.println("daemon thread started");  
		  }  
		  else{  
		  System.out.println("user thread started");  
		 }  
		 }  
		 public static void main(String[] args){  
		  DaemonThreadEx t1=new DaemonThreadEx();//creating thread  
		  DaemonThreadEx t2=new DaemonThreadEx();  
		  DaemonThreadEx t3=new DaemonThreadEx();  
		  
		  t1.setDaemon(true);//now t1 is daemon thread  
		    
		  t1.start();//starting threads  
		  t2.start();  
		  t3.start();  
		 } 
}
