package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio1;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ejercicio1 {
	static JFrame ordered = new JFrame();
	static JFrame unordered = new JFrame();
	
	public static void main (String[] args) {
		int nWords = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas palabras vas a introducir?"));
		String[][] words = new String[2][nWords];
		initFrame(unordered,1);
		initFrame(ordered,2);
		fillWords(words);
		showWords(words,0,unordered);
		orderWords(words);
		//Aquí falta el método para ordenar las palabras
		JOptionPane.showMessageDialog(null, "Voy a ordenar tus palabras");
		showWords(words,1,ordered);
	}
	public static void initFrame(JFrame frame, int nFrame) {
		int height = (int)(0.95*Toolkit.getDefaultToolkit().getScreenSize().height);
		int width = (int)(0.25*Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setSize(width,height);
		if (nFrame==1) {
			frame.setLocation(0, 0);
			frame.setTitle("Palabras Desordenadas");
		} else {
			frame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width-width, 0);
			frame.setTitle("Palabras Ordenadas");
		}
	}
	public static void fillWords(String[][] matrix) {
		int columns = matrix[0].length;
		for(int i=0;i<columns;i++) {
			matrix[0][i] = JOptionPane.showInputDialog("¿Qué palabra introducimos?");
		}
	}
	public static void showWords(String[][] matrix, int row, JFrame window) {
		int columns = matrix[0].length;
		Font comic =new Font("Dialog", Font.BOLD, 13);
		String words = "\n";
		for(int i=0;i<columns;i++) {
			words+="         "+matrix[row][i]+"\n";
		}
		JTextArea tWords = new JTextArea(words);
		tWords.setFont(comic);
		tWords.setEditable(false);
		window.add(tWords);
		window.setVisible(true);
	}
	public static void orderWords(String[][] matrix) {
		int columns = matrix[0].length;
		int fIndex;
		for (int i=0;i<columns;i++) {
			fIndex=0;
			for(int j=columns-1;j>i;j--) {
				//Agregar condicion para que funcione
			}
			matrix[1][i]=matrix[0][fIndex];
		}
		
	}
}
