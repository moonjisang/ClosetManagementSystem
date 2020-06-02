package th10report;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Test {

	public static void main(String[] args) {
		JFrame frame = new JFrame("test");
		JPanel panel1 = new JPanel();
		JButton b1 = new JButton("press me");
		b1.setBounds(50, 10, 100, 50);
		
		panel1.setLayout(null);
		panel1.add(b1);
		
		frame.setContentPane(panel1);
			
		frame.setSize(300, 200);
		frame.setVisible(true);
	}

}

