package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	
	MenuSelection menuselection ;
	ClotheAdder clotheadder ;
	ClotheViewer clotheviewer ;

	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.clotheadder = new ClotheAdder(this);
		this.clotheviewer = new ClotheViewer(this);
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public ClotheAdder getClotheadder() {
		return clotheadder;
	}

	public void setClotheadder(ClotheAdder clotheadder) {
		this.clotheadder = clotheadder;
	}

	public ClotheViewer getClotheviewer() {
		return clotheviewer;
	}

	public void setClotheviewer(ClotheViewer clotheviewer) {
		this.clotheviewer = clotheviewer;
	}
	

}
