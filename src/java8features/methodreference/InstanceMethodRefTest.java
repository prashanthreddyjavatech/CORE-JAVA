package java8features.methodreference;

public class InstanceMethodRefTest {
	  public void message(){  
			System.out.println("Instance Method called");  
		    }
	  public static void main(String[] args) {
		  InstanceMethodRefTest  ref=new InstanceMethodRefTest();
		  
		  Message msg=ref::message; 
		  msg.display();
	}
}
