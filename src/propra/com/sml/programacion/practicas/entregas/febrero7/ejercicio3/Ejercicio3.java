package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio3 {
	static Ex3Graphics menu = new Ex3Graphics();
	static ArrayList<String> process = new ArrayList<String>();
	public static void main (String [] args) {
		menu.setVisible(true);
	}
	public static void addProcess() {
		String name;
		if(process.size()<100) {
			name=JOptionPane.showInputDialog("Introduce el nombre del proceso a añadir:");
			process.add(name+".exe");
		} else {
			JOptionPane.showMessageDialog(null, "Hay 100 procesos en cola, no hay hueco para mas");
		}
	}
	public static void processDone() {
		if(process.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No has introducido ningún proceso");
		} else {
			JOptionPane.showMessageDialog(null, "Se ha acabado de ejecutar el proceso: "+Ejercicio3.process.get(0));
			process.remove(0);
		}	
	}
	public static void off() {
		System.exit(0);
	}
}
