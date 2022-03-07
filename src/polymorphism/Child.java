package polymorphism;

public class Child extends Parent{
	
	public void myCustomMethod() {
		System.out.println("Overriding Method");
	}


	public static void main(String[] args) {
		Parent parentObj=new Child();
		parentObj.myCustomMethod();
		// Child cObj=new Parent(); // Can not convert Parent to Child
		
	}

}
