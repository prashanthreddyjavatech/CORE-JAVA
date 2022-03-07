package awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterEx extends WindowAdapter{
	Frame f;
	public WindowAdapterEx() {
		 f=new Frame();
		f.addWindowListener(this);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true); 
	}
	public void windowClosing(WindowEvent we) {
		f.dispose();
	}
	public static void main(String[] args) {
		new WindowAdapterEx();
	}

}
