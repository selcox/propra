package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio5;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio5 {
	static Ex5Graphics menu = new Ex5Graphics();
	static ArrayList<String> process = new ArrayList<String>();
	static ArrayList<Integer> processDuration = new ArrayList<Integer>();
	public static void main (String [] args) {
		menu.setVisible(true);
	}
	public static void addProcess() {
		String name;
		int duration;
		if(process.size()<100) {
			name=JOptionPane.showInputDialog("Introduce el nombre del proceso a añadir:");
			process.add(name+".exe");
			duration=Integer.parseInt(JOptionPane.showInputDialog("Introduce la duración del proceso a añadir:"));
			processDuration.add(duration);
		} else {
			JOptionPane.showMessageDialog(null, "Hay 100 procesos en cola, no hay hueco para mas");
		}
	}
	public static void processDone() {
		if(process.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No has introducido ningún proceso");
		} else {
			String name=process.get(0);
			int duration=processDuration.get(0);
			duration--;
			process.remove(0);
			processDuration.remove(0);
			if(duration>0) {
				JOptionPane.showMessageDialog(null, "Se ha acabado de ejecutar un ciclo del proceso: "+name+"\nQuedan "+duration+" ciclos de procesamiento restantes");
				process.add(name);
				processDuration.add(duration);
			} else {
				JOptionPane.showMessageDialog(null, "Se ha acabado de ejecutar el proceso: "+name);
			}
		}	
	}
	public static void off() {
		System.exit(0);
	}
}
