package propra.com.sml.programacion.utilities.graphics;

import java.awt.Toolkit;
import javax.swing.JFrame;

public class Frame extends JFrame {
	public static final int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width/2;
	public static final int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height/2;
	public Frame(String title) {
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle(title);
	}
	public int getWIDTH() {
		return WIDTH;
	}
	public int getHEIGHT() {
		return HEIGHT;
	}
}
