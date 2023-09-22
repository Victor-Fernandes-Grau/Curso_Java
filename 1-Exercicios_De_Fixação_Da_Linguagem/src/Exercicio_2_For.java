import java.util.Scanner;

public class Exercicio_2_For {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int dentro = 0;  
		int fora = 0;
		int x = sc.nextInt();
		
		for(int i = 0; i < x; i++) {
			int y = sc.nextInt();
			if(y>= 10 && y <= 20) {
				dentro++;
			}else {
				fora++;
			}
			
		}
		System.out.println(dentro + "IN");
		System.out.println(fora + "OUT");
		sc.close();
		
		

	}

}
