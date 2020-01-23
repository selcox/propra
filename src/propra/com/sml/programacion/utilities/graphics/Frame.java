package propra.com.sml.programacion.utilities.graphics;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame {
	public static final int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width/2;
	public static final int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
	public Frame(String title) {
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setTitle(title);
	}
	public int getWIDTH() {
		return WIDTH;
	}
	public int getHEIGHT() {
		return HEIGHT;
	}
}
