package abstraction;

public class Honda extends Bike{

	@Override
	public void run() {
		System.out.println("Bike riding");
		
	}
	
	public static void main(String[] args) {
		Bike b=new Honda();
		b.run();
	}

}
