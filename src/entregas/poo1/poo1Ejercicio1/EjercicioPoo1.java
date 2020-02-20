package entregas.poo1.poo1Ejercicio1;

public class EjercicioPoo1 {
	static Conjunto a = new Conjunto();
	static Conjunto b = new Conjunto();
	static Conjunto c = new Conjunto();
	static Conjunto d = new Conjunto();
	static Conjunto e = new Conjunto();
	static Conjunto f = new Conjunto();
	public static void main(String[] args) {
		initConjuntos();
		showConjuntos();
		showUnions();
		showIntersections();
		showDifferences();
		showExists();
		showSubElements();
		showEquals();
		showFormatElements();
	}
	public static void initConjuntos() {
		for(int i=1,j=4;i<7;i++,j++) {
			a.addElement(i);
			b.addElement(j);
		}
		for(int i=1,j=6;i<4;i++,j--) {
			c.addElement(i);
			d.addElement(j);
		}
		f.addElement(6);
		f.addElement(9);
		f.addElement(4);
		f.addElement(5);
		f.addElement(8);
		f.addElement(7);
		
		e.addElement(3);
		e.addElement(5);
		e.addElement(4);
		e.addElement(1);
		e.addElement(6);
		e.addElement(2);
	}
	public static void showConjuntos() {
		System.out.print("Conjunto A: ");
		a.showElements();
		System.out.print("Conjunto B: ");
		b.showElements();
		System.out.print("Conjunto C: ");
		c.showElements();
		System.out.print("Conjunto D: ");
		d.showElements();
		System.out.print("Conjunto E: ");
		e.showElements();
		System.out.print("Conjunto F: ");
		f.showElements();
	}
	public static void showUnions() {
		System.out.print("\nA union B: ");
		a.showUnion(b);
		System.out.print("A union C: ");
		a.showUnion(c);
		System.out.print("B union C: ");
		b.showUnion(c);
	}
	public static void showIntersections() {
		System.out.print("\nA intersección B: ");
		a.showIntersect(b);
		System.out.print("A intersección C: ");
		a.showIntersect(c);
		System.out.print("B intersección C: ");
		b.showIntersect(c);
	}
	public static void showDifferences() {
		System.out.print("\nA - B: ");
		a.showDifference(b);
		System.out.print("A - C: ");
		a.showDifference(c);
		System.out.print("B - C: ");
		b.showDifference(c);
	}
	public static void showExists() {
		System.out.print("\nA contiene 8: "+a.checkExist(8));
		System.out.print("\nB contiene 4: "+b.checkExist(4));
		System.out.print("\nC contiene 6: "+c.checkExist(6));
		System.out.print("\nA contiene 2: "+a.checkExist(2));
		System.out.print("\nB contiene 9: "+b.checkExist(9));
		System.out.print("\nC contiene 1: "+c.checkExist(1));
	}
	public static void showSubElements() {
		System.out.print("\n\nD es un subconjunto de B: "+d.checkSubElement(b));
		System.out.print("\nA es un subconjunto de C: "+a.checkSubElement(c));
		System.out.print("\nB es un subconjunto de A: "+b.checkSubElement(a));
		System.out.print("\nD es un subconjunto de C: "+d.checkSubElement(c));
		System.out.print("\nC es un subconjunto de A: "+c.checkSubElement(a));
		System.out.print("\nD es un subconjunto de A: "+d.checkSubElement(a));
	}
	public static void showEquals() {
		System.out.print("\n\nA = C: "+a.checkEquals(c));
		System.out.print("\nE = A: "+e.checkEquals(a));
		System.out.print("\nB = D: "+b.checkEquals(d));
		System.out.print("\nF = B: "+f.checkEquals(b));
	}
	public static void showFormatElements() {
		System.out.print("\n\nConjunto A con formato especial: ");
		a.showFormatElements();
		System.out.print("\nConjunto B con formato especial: ");
		b.showFormatElements();
		System.out.print("\nConjunto C con formato especial: ");
		c.showFormatElements();
		System.out.print("\nConjunto D con formato especial: ");
		d.showFormatElements();
		System.out.print("\nConjunto E con formato especial: ");
		e.showFormatElements();
		System.out.print("\nConjunto F con formato especial: ");
		f.showFormatElements();
	}
}

