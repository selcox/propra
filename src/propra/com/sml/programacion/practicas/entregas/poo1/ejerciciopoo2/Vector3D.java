package propra.com.sml.programacion.practicas.entregas.poo1.ejerciciopoo2;

import java.util.Random;

public class Vector3D {
	private int x;
	private int y;
	private int z;
	public Vector3D() { //Crea un vector con valores entre -10 y 10
		Random r = new Random();
		x=-10+r.nextInt(21);
		y=-10+r.nextInt(21);
		z=-10+r.nextInt(21);
	}
	public Vector3D(int x, int y, int z) { //Crea un vector con los valores predefinidos por el usuario
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public void showVector() { //Muestra las cordenadas del vector
		System.out.println("<"+x+","+y+","+z+">");
	}
	public void sumVectors(Vector3D v2) { //Muestra el vector suma
		Vector3D vAux = new Vector3D(x+v2.x,y+v2.y,z+v2.z);
		vAux.showVector();
	}
	public void subsVectors(Vector3D v2) { //Muestra el vector resta
		Vector3D vAux = new Vector3D(x-v2.x,y-v2.y,z-v2.z);
		vAux.showVector();
	}
	public void scalarProductVectors(Vector3D v2) { //Muestra el producto escalar
		System.out.println(x*v2.x+y*v2.y+z*v2.z);
	}
	public void vectorialProductVectors(Vector3D v2) { //Muestra el producto vectorial
		int x3 = this.y*v2.z-this.z*v2.y;
		int y3 = this.z*v2.x-this.x*v2.z;
		int z3 = this.x*v2.y-this.y*v2.x;
		Vector3D vAux = new Vector3D(x3,y3,z3);
		vAux.showVector();
	}
}
