package propra.com.sml.programacion.practicas.entregas.poo1.ejerciciopoo1;

import java.util.ArrayList;

public class Conjunto extends ArrayList<String> {
	private static final long serialVersionUID = 1L;
	public void addNumber(int number) { //Works pecfectly but need to make it on a GUI
		if(checkIfExist(number)) {
			System.out.println("El número "+number+" ya existe en el conjunto");
		} else {
			this.add(String.valueOf(number));
		}
	}
	public void delNumber(int number) { //Works pecfectly but need to make it on a GUI
		String aux="";
		if(checkIfExist(number)) {
			for(String i : this) {
				if(i.equals(String.valueOf(number))) {
					aux=i;
				}
			}
			this.remove(aux);			
		} else {
			System.out.println("El número "+number+" no existe en el conjunto");
		}
	}
	public void showUnion(Conjunto c) { //It works but it doesnt have to say if exist or not
		Conjunto aux = new Conjunto();
		for (String i : this) {
			aux.addNumber(Integer.valueOf(i));
		}
		for (String i : c) {
			aux.addNumber(Integer.valueOf(i));
		}
		aux.showNumbers();
	}
	public void showIntersect(Conjunto c) { //It works but it doesnt have to say if exist or not
		Conjunto aux = new Conjunto();
		for (String i : this) {
			if(c.checkIfExist(Integer.valueOf(i))) {
				aux.addNumber(Integer.valueOf(i));
			}
		}
		aux.showNumbers();
	}	
	public void showDiference() {
		
	}
	public boolean checkIfExist(int number) {
		boolean exist=false;
		for (String i : this) {
			if(i.equals(String.valueOf(number))) {
				exist=true;
			}
 		}
		return exist;
	}
	public void checkSubSet() {
		
	}
	public void checkEquals() {
		
	}
	public void showNumbers() { //Works pecfectly but need to make it on a GUI
		System.out.println(this);
	}
}
