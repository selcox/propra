package entregas.poo1.poo1ejercicio3;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Board extends JPanel {
	private static final long serialVersionUID = 1L;
	public final static int SIZE = (int) (Toolkit.getDefaultToolkit().getScreenSize().height*0.15);
	public static JLabel[][] positions = new JLabel[3][3];
	Font labelFont = new Font("Verdana",Font.BOLD, SIZE);
	public static boolean playerOne = true;
	Mouse mouse = new Mouse();
	static String x = "X";
	static String o = "O";
	public Board() {
		initLabels();
		setLayout(new GridLayout(3,3));
		for(int i = 0; i<3; i++) {
			for(int j = 0; j<3; j++) {
				add(positions[i][j]);
			}
		}
	}
	public void initLabels() {
		for(int i = 0; i<3 ; i++) {
			for(int j = 0; j<3; j++) {
				positions[i][j] = new JLabel();
				positions[i][j].setText("");
				positions[i][j].setFont(labelFont);
				positions[i][j].addMouseListener(mouse);
				positions[i][j].setBorder(new LineBorder(Color.black));
				positions[i][j].setHorizontalAlignment(JLabel.CENTER);
			}
		}
	}
	public static void activatePosition(int i, int j) {
		if(playerOne) {
			positions[i][j].setText(x);
			changeTurn();
			checkWin();
		} else {
			positions[i][j].setText(o);
			changeTurn();
			checkWin();
		}
	}
	public static void changeTurn() {
		if(playerOne) {
			playerOne=false;
		} else {
			playerOne=true;
		}
	}
	public static void checkColumnWin() {
		int xNumber=0;
		int oNumber=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(positions[i][j].getText().equals(x)) {
					xNumber++;
				}
				if(positions[i][j].getText().equals(o)) {
					oNumber++;
				}
			}if(xNumber==3) {
				showWin("Ganan las X en la fila "+(i+1));
			}
			if(oNumber==3) {
				showWin("Ganan las O en la fila "+(i+1));
			}
			xNumber=0;
			oNumber=0;
		}
	}
	public static void checkRowWin() {
		int xNumber=0;
		int oNumber=0;
		for(int j=0;j<3;j++) {
			for(int i=0;i<3;i++) {
				if(positions[i][j].getText().equals(x)) {
					xNumber++;
				}
				if(positions[i][j].getText().equals(o)) {
					oNumber++;
				}
			}
			if(xNumber==3) {
				showWin("Ganan las X en la columna "+(j+1));
			}
			if(oNumber==3) {
				showWin("Ganan las O en la columna "+(j+1));
			}
			xNumber=0;
			oNumber=0;
		}
	}
	public static void checkDiagonalWin() {
		int xNumber=0;
		int oNumber=0;
		int xNumber2=0;
		int oNumber2=0;
		for(int i=0,j=0,k=2;i<3;i++,j++,k--) {
			if(positions[i][j].getText().equals(x)) {
				xNumber++;
			}
			if(positions[i][j].getText().equals(o)) {
				oNumber++;
			}if(positions[i][k].getText().equals(x)) {
				xNumber2++;
			}
			if(positions[i][k].getText().equals(o)) {
				oNumber2++;
			}
			if(xNumber==3) {
				showWin("Ganan las X en la diagonal 1");
			}
			if(oNumber==3) {
				showWin("Ganan las O en la diagonal 1");
			}
			if(xNumber2==3) {
				showWin("Ganan las X en la diagonal 2");
			}
			if(oNumber2==3) {
				showWin("Ganan las O en la diagonal 2");
			}
		}			
	}
	public static void checkWin() {
		checkColumnWin();
		checkRowWin();
		checkDiagonalWin();
	}
	public static void showWin(String text) {
		JOptionPane.showMessageDialog(null, text);
		System.exit(0);
	}
}

