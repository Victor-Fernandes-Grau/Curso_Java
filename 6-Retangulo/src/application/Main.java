package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Lincar co o pacote entities do retangulo
		Retangulo retangulo = new Retangulo();
		
		
		System.out.print("Entre com a alutra do retandulo: ");
		retangulo.altura = sc.nextDouble();
		System.out.print("Entre com a largura do retandulo: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.println("Dados do retangulo: " + retangulo);
		
		
		sc.close();
	}

}
