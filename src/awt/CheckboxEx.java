package awt;

import java.awt.Checkbox;
import java.awt.Frame;

public class CheckboxEx {
	CheckboxEx(){
	      Frame f= new Frame("checkbox");  
	        Checkbox checkbox1 = new Checkbox("checkbox1");  
	        checkbox1.setBounds(100,100, 100,50);  
	        Checkbox checkbox2 = new Checkbox("checkbox2", true);  
	        checkbox2.setBounds(100,150, 100,50);  
	        f.add(checkbox1);  
	        f.add(checkbox2);  
	        f.setSize(400,400);  
	        f.setLayout(null);  
	        f.setVisible(true);
	}
	public static void main(String[] args) {
		new CheckboxEx();
	}

}
