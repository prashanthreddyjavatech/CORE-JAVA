package awt;

import java.awt.Button;
import java.awt.Frame;

public class FrameNameEx {
	public static void main(String[] args) {
		Frame f=new Frame("AWT Application");
		Button b=new Button("Click Here");
		b.setBounds(50, 100, 80, 30);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
