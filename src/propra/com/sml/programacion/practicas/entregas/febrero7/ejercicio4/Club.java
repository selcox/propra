package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio4;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Club { //El club tiene dinero y nombre
	private static int money;
	public static String name;

	public Club() { //Inicia el club con 10.000.000€ y el nombre que quiera el usuario
		money=10000000;
		name=JOptionPane.showInputDialog("¿Cómo se llama el club?");
	}
	public String getClubName() { //Devuelve el nombre del club
		return name;
	}
	public int getClubMoney() { //Devuelve el dinero del club
		return money;
	}
	public void buyPlayer(int moneySpent) { //Resta el dinero de una compra
		money-=moneySpent;
	}
	public void sellPlayer(int moneyReceived) { //Suma el dinero de una venta
		money+=moneyReceived;
	}
	public String getFormatMoney() { //Devuelve el dinero del club con éste formato: 000.000.000.000
		DecimalFormat addPoints = new DecimalFormat("###,###,###,###");
		return addPoints.format(money);
	}
}