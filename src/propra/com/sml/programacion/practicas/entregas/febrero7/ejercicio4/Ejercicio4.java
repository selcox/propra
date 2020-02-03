package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio4 {

}
class Club {
	private int money;
	private ArrayList<String> clubPlayers = new ArrayList<String>();
	public Club() {
		money=10000000;
	}
}
class Player {
	String[] possibleNames = {""};
	String[] possibleSurnames = {""};
	Random selector = new Random();
	private int value;
	private String name;
	public Player() {
		value=selector.nextInt(4000000)+400000;
		name="";
	}
}
