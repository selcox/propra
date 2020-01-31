package propra.com.sml.programacion.practicas.entregas.febrero7.ejercicio2;

import java.util.Random;

public class Ejercicio2 {
	static Random selector = new Random();
	static String[] company = {"IBM","Ubisoft","Microsoft","Mojang","Bethesda","Electronic Arts","Nintendo","Konami","Activision","Valve"};
	static String[] employees = {"Juan","María","Sergio","Federico","Amy","Pablo","Leandro","Susana","Lorena","Julio","Beatriz","Julia","Paula","Adrián","James","David","Nuria","Pedro","Anabel","Luisa","Juanjo"};
	static int[][][] cube = new int[3][4][6];
	static String[][] auxEmployees = new String[3][4];
	static String company1="";
	static String company2="";
	static String company3="";
	static int sumSalaries;
	public static void main(String[] args) {
		fillSalaries(cube);
		fillCompanies(company1,company2,company3);
		fillEmployees();
		initFrame();
	}
	public static void initFrame() {
		Ex2Graphics window = new Ex2Graphics();
		//window.setTextArea(area1, area2, area3);
		window.setVisible(true);
	}
	public static void fillSalaries(int[][][] cube) {
		for(int i=0;i<cube.length;i++) {
			for(int j=0;j<cube[0].length;j++) {
				sumSalaries=0;
				for(int k=0;k<cube[0][0].length;k++) {
					if(k==(cube[0][0].length-1)) {
						cube[i][j][k]=sumSalaries/5;
					} else {
						cube[i][j][k]=selector.nextInt(3501)+1000;
						sumSalaries+=cube[i][j][k];
					}
				}
			}
		}
	}
	public static void fillCompanies(String name1, String name2, String name3) {
		String constant="\nEmpresa: ";
		while (name1.equals(name2) || name2.equals(name3) || name1.equals(name3)) {
			name1=constant+company[selector.nextInt(company.length)];
			name2=constant+company[selector.nextInt(company.length)];
			name3=constant+company[selector.nextInt(company.length)];
		}
	}
	public static void fillEmployees() {
		String name1="";
		String name2="";
		String name3="";
		String name4="";
		for(int i=0;i<auxEmployees.length;i++) {
			while (name1.equals(name2) || name1.equals(name3) || name1.equals(name4) || name2.equals(name3) || name2.equals(name4) || name3.equals(name4)) {
				name1=employees[selector.nextInt(employees.length)];
				name2=employees[selector.nextInt(employees.length)];
				name3=employees[selector.nextInt(employees.length)];
				name4=employees[selector.nextInt(employees.length)];
			}
			auxEmployees[i][0]=name1;
			auxEmployees[i][1]=name2;
			auxEmployees[i][2]=name3;
			auxEmployees[i][3]=name4;
		}
	}
}

