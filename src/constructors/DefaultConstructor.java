package constructors;

public class DefaultConstructor {
	
	DefaultConstructor(){
		System.out.println("Default constructor call executed.");
	}
	public static void main(String[] args) {
		
	// New keyword created the Object of class & invokes the constructor to initialize the created Object
		DefaultConstructor defaultconst=new DefaultConstructor();
	}

}
