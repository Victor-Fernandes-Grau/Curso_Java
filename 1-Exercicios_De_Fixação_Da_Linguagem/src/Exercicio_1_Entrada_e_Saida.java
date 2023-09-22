import java.util.Scanner;

public class Exercicio_1_Entrada_e_Saida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*
		Exercícios sobre Estrutura Sequencial (entrada, processamento, saída
				  
		Exercicio 1: Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
		mensagem explicativa.
		*/	 
				
				
		Scanner sc = new Scanner(System.in);
				
		int entrada1, entrada2;
		entrada1 = sc.nextInt();
		entrada2 = sc.nextInt();
				
		System.out.println("Soma = " + (entrada1 + entrada2));
				
		sc.close();
				
	}

}
