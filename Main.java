package main;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public static Dimension size = new Dimension(640, 480);
	public static JTextField textbox;
	
	public Main(String title) {
		super(title);
		setSize(size);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public void init() {
		
	}

	public static void main(String[] args) {
		Main main = new Main("Genetic Reshuffle");
	}

}
