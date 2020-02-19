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
		Conjunto aux = new Conjunto();
		for(Integer element : elements) {
			aux.addElement(element);
		}
		for(Integer element : comparation.elements) {
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
		Conjunto aux = new Conjunto();
		Conjunto aux2 = new Conjunto();
		for(Integer element : elements) {
			aux.addElement(element);
		}
		for(Integer compElement : comparation.elements) {
			if(this.checkExist(compElement)) {
				aux2.addElement(compElement);
			}
		}
		for(Integer delElement : aux2.elements) {
			aux.delElement(delElement);
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
	public boolean checkSubElement(Conjunto comparation) {
		for(Integer element : elements) {
			if(!comparation.checkExist(element)) {
				return false;
			}
		}
		return true;
	}
	public boolean checkEquals(Conjunto comparation) {
		if(elements.size()!=comparation.elements.size()) {
			return false;
		}
		for(Integer element : elements) {
			if(!comparation.checkExist(element)) {
				return false;
			}
		}
		return true;
	}	
	public void showElements() { //Works perfectly, need GUI
		System.out.print(elements+"\n");
	}	
	public void showFormatElements() {
		for(Integer element : elements) {
			System.out.print(" el"+element);
		}
	}
}
