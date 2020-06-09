package th11Report;

import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FCCalculater extends JFrame
{
	FCCalculater() {
		setTitle("MyFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 1));

		JTextField t1 = new JTextField(30);
		JTextField t2 = new JTextField(30);
		JButton bu = new JButton("Convert");
		
		c.add(new JLabel("È­¾¾¿Âµµ"));
		c.add(t1);
		c.add(new JLabel("¼·¾¾¿Âµµ")); 
		c.add(t2);
		
		bu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double f = Double.parseDouble(t1.getText());
					double c = (f - 32)*5/9;
					t2.setText(String.valueOf(c));
				} catch(Exception ex) {
				}
			}
		}
	);
		c.add(bu);
		setSize(400,100);
		setVisible(true);
	} 
} 