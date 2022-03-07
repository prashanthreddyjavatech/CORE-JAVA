package exceptionhandling;

public class CustomExceptionMain {
	public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyOwnException("This is My error Message");
		}
		catch(MyOwnException exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }

}
