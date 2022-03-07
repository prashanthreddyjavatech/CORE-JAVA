package awt;

import java.awt.Button;
import java.awt.Frame;

public class FrameEx extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	FrameEx() {

		Button b = new Button("Click Here");
		b.setBounds(30, 100, 80, 30);
		add(b);
		setLayout(null);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		FrameEx f = new FrameEx();
	}

}
