package awt;

import java.awt.Frame;
import java.awt.TextArea;

public class TextAreaEx extends Frame {
	TextAreaEx(){
		TextArea ta=new TextArea("Welcome to Java World");
		ta.setBounds(10, 30, 300, 300);
		add(ta);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
	
		new TextAreaEx();
		
	}

}
