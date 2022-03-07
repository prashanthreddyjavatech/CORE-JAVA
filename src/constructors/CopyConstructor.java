package constructors;

//class to create CopyConstructor object and calculate area
public class CopyConstructor {

	public static void main(String[] args) {
		Rectangle firstRect = new Rectangle(5, 6);
		Rectangle secondRect = new Rectangle(firstRect);
		System.out.println("Area  of First CopyConstructor : " + firstRect.area());
		System.out.println("Area of First Second CopyConstructor : " + secondRect.area());
	}

}
