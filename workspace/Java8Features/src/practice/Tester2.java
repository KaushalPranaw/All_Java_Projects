package practice;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tester2 {

	public static void main(String[] args) {
		 JTextField tf=new JTextField();
		 tf.setBounds(50,50,150,20);
		 JButton button=new JButton("submit");
		 button.setBounds(50, 100, 100, 50);
		 
		 button.addActionListener(e->{tf.setText("Hello World");});
		 
		 JFrame f=new JFrame();  
	        f.add(tf);
	        f.add(button);  
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        f.setLayout(null);  
	        f.setSize(300, 200);  
	        f.setVisible(true);  
	}
}
