package java8features.methodreference;

public class ConstructorRefTest {
	public static void main(String[] args) {
		GrettingInterface ref=Hello::new;
		ref.display("Hello,Greetings of the day");
	}

}
