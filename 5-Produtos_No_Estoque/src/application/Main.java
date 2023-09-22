package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Capitando as informações.
		Product product = new Product();
		System.out.println("Digite a data do produto: ");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		product.quantity = sc.nextInt();
		
		//Mostrando os dados 
		System.out.println();
		System.out.println("Dados do produto: " + product);
		System.out.println();
		
		//Pegando novos dados para acrecentar no estoque
		System.out.print("Entre com o numero do produto a ser adicionado no estoque: ");
		int quantity = sc.nextInt();
		product.AddProducts(quantity);
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		System.out.println();
		
		//Pegando novos dados para tirar no estoque
		System.out.print("Digite a quantidade que deve ser retirada do estoque: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		
		sc.close();
	}
}