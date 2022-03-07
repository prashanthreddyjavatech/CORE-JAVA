package awt;

import java.awt.Button;
import java.awt.Frame;

public class FrameEx1 extends Frame{
	FrameEx1(){
		Button b=new Button("click me");
		b.setBounds(30, 100, 50, 30);
		add(b);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	

}
