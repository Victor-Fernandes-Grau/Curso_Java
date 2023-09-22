package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Criando as variaveis dos lados dos triangulos
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC;
		double yA, yB, yC;
		double px, py;
		double areaX, areaY;
		
		
		//Recebendo os dados do triangulo
		System.out.println("Entre com os valores do primeiro triangulo");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com os valores do segundo triangulo");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		//Calculos das areas
		px = (xA + xB +xC) / 2.0;
		areaX = Math.sqrt(px*(px-xA)*(px-xB)*(px-xC));
		
		py = (yA + yB +yC) / 2.0;
		areaY = Math.sqrt(py*(py-yA)*(py-yB)*(py-yC));
		
		//Sauda das areas
		System.out.printf("Primeiro triangulo tem area: %.4f%n", areaX);
		System.out.printf("Segundo triangulo tem area: %.4f%n", areaY);
		
		//Descorindo qual tem maior area
		
		if (areaX > areaY) {
			System.out.println("O Primeiro triangulo e maior");
		}else {
			System.out.println("O Segundo triangulo e maior");
		}
		
		sc.close();
	}

}
