package propra.com.sml.programacion.practicas.entregas.poo1.ejerciciopoo2;

public class EjercicioPoo2 {
	
	public static void main(String[] args) {
		Vector3D a = new Vector3D(); //Vector3D can be created with chosen values too
		Vector3D b = new Vector3D(); //using other constructor: new Vector3D(x,y,z)
		System.out.println("V1:");
		a.showVector();
		System.out.println("\nV2:");
		b.showVector();
		System.out.println("\nV1+V2:");
		a.sumVectors(b);
		System.out.println("\nV1-V2:");
		a.subsVectors(b);
		System.out.println("\nV1xV2:");
		a.vectorialProductVectors(b);
		System.out.println("\nV1.V2:");
		a.scalarProductVectors(b);
	}
}
