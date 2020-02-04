package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.util.ArrayList;

public class Ejercicio4 {
	static ArrayList<Player> boughtPlayers = new ArrayList<Player>(); 
	static ArrayList<Player> avaliablePlayers = new ArrayList<Player>(); 
	public static void main(String[] args) {
		Club myClub = new Club();
		Ex4Graphics menu = new Ex4Graphics();
	}
	public static void fillAvaliable() {
		for(int i=0;i<25;i++) {
			avaliablePlayers.add(new Player());
		}
	}
}

