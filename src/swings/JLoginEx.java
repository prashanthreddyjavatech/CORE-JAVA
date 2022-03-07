package swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JLoginEx {
	public static void main(String[] args) {
		JFrame f=new JFrame("Login");
		JPasswordField value=new JPasswordField();
		JLabel l1=new JLabel("Username ");
		l1.setBounds(20, 60, 80, 30);
		JTextField tf=new JTextField();
		tf.setBounds(80, 60, 80, 30);
		JLabel l2=new JLabel("Password ");
		l2.setBounds(20, 100, 80, 30);
		value.setBounds(80, 100, 80, 30);
		JButton b=new JButton("Submit");
		b.setBounds(50, 150, 75, 30);
		JLabel l3=new JLabel();
		l3.setBounds(20, 200, 300, 30);
		f.add(l1);
		f.add(l2);
		f.add(tf);
		f.add(value);
		f.add(b);
		f.add(l3);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username=tf.getText();
				String password=new String(value.getPassword()); 
				if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
				l3.setText("Login Successfull");	
				}
				else {
					l3.setText("Invalid username/password,please try again");
				}
			}
		});
		
	}

}
