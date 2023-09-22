import java.util.Scanner;

public class Exercicio_2_If_Else {

	public static void main(String[] args) {
		/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		 */ 
		 
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		
		if(x %2 ==0) {
			System.out.print("Par");
		}else {
			System.out.print("Inpar");
		}
		
		sc.close();
		
	}

}
