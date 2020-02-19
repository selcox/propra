package propra.com.sml.programacion.practicas.entregas.poo1.ejerciciopoo1;

import java.util.ArrayList;

public class Conjunto {
	private ArrayList<Integer> elements = new ArrayList<>();
	public void addElement(Integer element) { //Works perfectly, need GUI
		if(!checkExist(element)) {
			elements.add(element);
		}
	}
	public void delElement(Integer element) { //Works perfectly, need GUI
		if(checkExist(element)) {
			elements.remove(element);
		}
	}
	public void showUnion(Conjunto comparation) { //Works perfectly, need GUI
		Conjunto aux = comparation;
		for(Integer element : elements) {
			aux.addElement(element);
		}
		aux.showElements();
	}
	public void showIntersect(Conjunto comparation) { //Need to get FIXED
		Conjunto aux = new Conjunto();
		for(Integer compElement : comparation.elements) {
			if(this.checkExist(compElement)) {
					aux.addElement(compElement);
			}
		}
		aux.showElements();
	}
	public void showDifference(Conjunto comparation) { //Need to get FIXED
		Conjunto aux = this;
		for(int i = aux.elements.size()-1; i>-1; i--) {
			for(Integer compElement : comparation.elements) {
				if(elements.get(i).equals(compElement)) {
					aux.delElement(elements.get(i));
					i--;
				}
			}
		}
		aux.showElements();
	}
	public boolean checkExist(Integer element) { //Works perfectly
		for(Integer listElement : elements) {
			if(listElement.equals(element)) {
				return true;
			}
		}
		return false;
	}
	public boolean checkSubElement() {
		return false;
	}
	public boolean checkEquals() {
		return false;
	}
	public void showElements() { //Works perfectly, need GUI
		System.out.println(elements);
	}	
}
