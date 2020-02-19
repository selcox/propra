package propra.com.sml.programacion.practicas.entregas.poo1.ejerciciopoo1;

public class EjercicioPoo1 {
	static Conjunto a = new Conjunto();
	static Conjunto b = new Conjunto();
	public static void main(String[] args) {
		initCases();
		a.showElements();
		b.showElements();
		//a.showUnion(b);
		a.showIntersect(b);
		//a.showDifference(b);
	}
	public static void initCases() {
		a.addElement(1);
		a.addElement(2);
		a.addElement(3);
		a.addElement(4);
		a.addElement(5);
		a.addElement(6);
		b.addElement(4);
		b.addElement(5);
		b.addElement(6);
		b.addElement(7);
		b.addElement(8);
		b.addElement(9);
	}
}
