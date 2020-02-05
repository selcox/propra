package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CustomBackGround extends JPanel {
	private static final long serialVersionUID = 1L;
	private static final int HEIGHT = (int) (Toolkit.getDefaultToolkit().getScreenSize().height);
	private static final int WIDTH = (int) (Toolkit.getDefaultToolkit().getScreenSize().width);
	public CustomBackGround() {
		setSize(WIDTH,HEIGHT);
		
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image image = new ImageIcon("src/propra/com/sml/programacion/practicas/entregas/febrero7/ejercicio4/resources/stadium.jpg").getImage();
		Image background = image.getScaledInstance(WIDTH, HEIGHT, 0);
		JLabel p = new JLabel(new ImageIcon(background));
		add(p);
		g.drawImage(background, 0, 0,null);
		setOpaque(false);
	}
}
