package propra.com.sml.programacion.practicas.entregas.poo1.ejerciciopoo1;

import java.util.ArrayList;
import java.util.Random;

public class EjercicioPoo1 {
	private static ArrayList<Integer> aCases = new ArrayList<>();
	private static ArrayList<Integer> bCases = new ArrayList<>();
	static Conjunto a = new Conjunto();
	static Conjunto b = new Conjunto();
	public static void main(String[] args) {
		initCases();
		a.showNumbers();
		b.showNumbers();
		a.showUnion(b);
		a.showIntersect(b);
	}
	public static void initCases() {
		Random r = new Random();
		for(int i=0;i<10;i++) {
			aCases.add(r.nextInt(30));
			bCases.add(r.nextInt(30));
		}
		for(Integer i : aCases) {
			a.addNumber(i);
		}
		for(Integer i : bCases) {
			b.addNumber(i);
		}
	}
}
