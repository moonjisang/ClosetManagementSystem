package th10report;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Pizza {

	public static void main(String[] args) {
		JFrame frame = new JFrame("MyFrame");
		JLabel j1 = new JLabel("Welcome to java pizza. Choose the type of pizza.");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JButton b1 = new JButton("Combination Pizza");
		JButton b2 = new JButton("Potato pizza");
		JButton b3 = new JButton("Roasted meat pizza");
		JLabel t1 = new JLabel("count");
		JTextArea t2 = new JTextArea("                         ");
		
		panel1.add(j1);
		panel2.add(b1);
		panel2.add(b2);
		panel2.add(b3);
		panel2.add(t1);
		panel2.add(t2);
		
		frame.setLayout(new GridLayout(4, 1));
		frame.add(panel1);
		frame.add(panel2);
		frame.setSize(600, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
