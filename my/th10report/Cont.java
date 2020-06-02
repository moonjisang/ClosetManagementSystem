package th10report;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Cont extends JFrame {
	
	public Cont() {
		Container cp = this.getContentPane();
		JButton jb = new JButton("JButton");
		JLabel jl = new JLabel("JLabel");
		
		cp.add(jb, BorderLayout.EAST);
		cp.add(jl, BorderLayout.WEST);
		cp.add(new JTextArea("JTextArea"), BorderLayout.CENTER);
		cp.add(new JButton("Click me"), BorderLayout.NORTH);
		cp.add(new JLabel("Hello"), BorderLayout.SOUTH);
		
		this.pack();
		this.setVisible(true);
		
	}

}
