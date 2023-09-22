package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		
		//Criando as variaveis dos lados dos triangulos
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		double px, py;
		double areaX, areaY;
		
		
		//Recebendo os dados do triangulo
		System.out.println("Entre com os valores do primeiro triangulo");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com os valores do segundo triangulo");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//Calculos das areas
		px = (x.a + x.b +x.c) / 2.0;
		areaX = Math.sqrt(px*(px-x.a)*(px-x.b)*(px-x.c));
		
		py = (y.a + y.b +y.c) / 2.0;
		areaY = Math.sqrt(py*(py-y.a)*(py-y.b)*(py-y.c));
		
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
