package inheritance.hierarchical;

public class HierarchicalInheritance {
	public static void main(String args[]) { 
		System.out.println("Calling for child class C"); 
		C c = new C(); 
		c.DisplayA(); 
		c.DisplayC(); 
		System.out.println("Calling for child class B"); 
		B b = new B(); 
		b.DisplayA();
		b.DisplayB();
	} 
}
