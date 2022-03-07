package abstraction;

public class InterfaceMainTest {
	public static void main(String[] args) {
		DrawableInterface d=new Circle();
		d.draw();
		d=new Rectangle();
		d.draw();
	}

}
