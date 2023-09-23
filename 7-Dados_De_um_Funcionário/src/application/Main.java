package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Nome: ");
		funcionario.nome = sc.nextLine();
		
		System.out.println("Salario: ");
		funcionario.salBruto = sc.nextDouble();
		
		System.out.println("Taxa: ");
		funcionario.taxa = sc.nextDouble();
		
		System.out.println();
		System.out.println("Empregado: " + funcionario);
		System.out.println();

		System.out.println("Porcentagem do almento: ");
		double percentage = sc.nextDouble();
		funcionario.IncrementoSalario(percentage);
		System.out.println();
		System.out.println("Dados atualizados: " + funcionario);
		
		sc.close();
	}

}
