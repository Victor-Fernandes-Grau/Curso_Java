import java.util.Scanner;

public class Exercicio_1_If_Else {

	public static void main(String[] args) {
		/* Exercícios sobre Estrutura Condicional (if-else)
		 * Exercicios para fixar o conteudo
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		 */

		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		
		if(x >=0) {
			System.out.print("Nao negativo");
		}else {
			System.out.print("Negativo");
		}
		
		sc.close();
			

	}

}
