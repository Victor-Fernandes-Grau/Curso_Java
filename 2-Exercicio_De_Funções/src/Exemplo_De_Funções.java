import java.util.Scanner;

public class Exemplo_De_Funções {

	public static void main(String[] args) {
	 // Somatoria Usando Função
	 
		
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int resultado = soma(x,y);
	MostrarResultado(resultado,x,y);
	
	sc.close();
	}
	
	public static int soma(int primeiro, int segundo) {
		return primeiro + segundo;
	}
	
	public static void MostrarResultado(int valor, int um, int dois){
		System.out.println("Soma de "+ um +" + " + dois + " = "+ valor);
	}
	
}
