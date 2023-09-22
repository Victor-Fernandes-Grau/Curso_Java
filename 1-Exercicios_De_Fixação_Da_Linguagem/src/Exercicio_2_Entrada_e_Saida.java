import java.util.Scanner;

public class Exercicio_2_Entrada_e_Saida {

	public static void main(String[] args) {
		/* Exercicio 2: Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Double raio;
		Double pi = 3.14159;
		
		raio = sc.nextDouble();
		Double resultado = pi * (raio * raio);
		System.out.printf("Resultado = %.4f%n", resultado);
		sc.close();
	
	}

}
