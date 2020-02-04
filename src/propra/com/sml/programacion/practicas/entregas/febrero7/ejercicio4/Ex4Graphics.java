package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Ex4Graphics extends JFrame {
	private static final int HEIGHT = (int) (Toolkit.getDefaultToolkit().getScreenSize().height);
	private static final int WIDTH = (int) (Toolkit.getDefaultToolkit().getScreenSize().width);
	private static final long serialVersionUID = 1L;
	private Font northFont = new Font("Verdana", Font.BOLD, WIDTH/120);
	public Ex4Graphics(Club club) {
		setSize(WIDTH/2,HEIGHT/2);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setUndecorated(true);
		createNorth(club);
		createCenter();
		setVisible(true);
	}
	public void createNorth(Club club) {
		JPanel north = new JPanel(new GridLayout(2,2));
		JTextField northLeftText = new JTextField();
		JTextField northRightText = new JTextField();
		JTextField blank1 = new JTextField();
		JTextField blank2 = new JTextField();
		northLeftText.setFont(northFont);
		northRightText.setFont(northFont);
		northLeftText.setText("     Nombre del Club: "+Club.getClubName());
		northRightText.setText("Dinero disponible: "+Club.getClubMoney()+"€     ");
		northRightText.setHorizontalAlignment(JTextField.RIGHT);
		northLeftText.setEditable(false);
		northRightText.setEditable(false);
		blank1.setEditable(false);
		blank2.setEditable(false);
		northLeftText.setBackground(this.getBackground());
		northRightText.setBackground(this.getBackground());
		blank1.setBackground(this.getBackground());
		blank2.setBackground(this.getBackground());
		north.add(northLeftText);
		north.add(northRightText);
		north.add(blank1);
		north.add(blank2);
		add(north,BorderLayout.NORTH);
	}
	public void createCenter() {
		JPanel center = new JPanel(new GridLayout(1,3));
		JTextArea centerWestText = new JTextArea("Paapa");
		JTextArea centerEastText = new JTextArea("Peepe");
		center.add(centerEastText);
		center.add(createCenterButtons());
		center.add(centerWestText);
		add(center,BorderLayout.CENTER);
	}
	public JPanel createCenterButtons() {
		JPanel centerButtons = new JPanel();
		return centerButtons;
	}
}
