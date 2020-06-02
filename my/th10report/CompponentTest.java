package th10report;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CompponentTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("test");
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("Fagrenheit temperature");
		JLabel label2 = new JLabel("Celsius temperature");
		JTextField field1 = new JTextField(10);
		JTextField field2 = new JTextField(10);		
		JButton button = new JButton("Convert");
		
		
		
		panel.add(label1);
		panel.add(label2);
		panel.add(field1);
		panel.add(field2);
		panel.add(button);
		frame.setContentPane(panel);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}
