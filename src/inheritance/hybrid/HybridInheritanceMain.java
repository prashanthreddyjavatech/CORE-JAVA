package inheritance.hybrid;

public class HybridInheritanceMain {
	public static void main(String[] args) {

		// Son object
		Son s = new Son();
		s.land();// Grand father method
		s.Car(); // Father method
		s.home();// Father method
		s.mobile();// son method

		// Daughter object
		Daughter d = new Daughter();
		d.land();// Grand father method
		d.Car(); // Father method
		d.home();// Father method
		d.purse();// son method
	}
}