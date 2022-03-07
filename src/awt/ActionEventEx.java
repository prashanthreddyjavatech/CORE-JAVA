package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventEx extends Frame implements ActionListener {
	TextField tf;

	public ActionEventEx() {
		tf = new TextField();
		tf.setBounds(60, 50, 170, 20);
		Button b = new Button("Click me");
		b.setBounds(100, 120, 80, 30);
		b.addActionListener(this);
		add(b);
		add(tf);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText("welcome");
	}

	public static void main(String[] args) {
		ActionEventEx ae = new ActionEventEx();
	}
}
