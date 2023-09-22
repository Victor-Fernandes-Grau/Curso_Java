import java.util.Scanner;

public class Exercicio_3_If_Else {

	public static void main(String[] args) {
		
		/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
		 *começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */ 
		 
		
			Scanner sc = new Scanner(System.in);
		
			int x, y, tempodejogo;
			x = sc.nextInt();
			y = sc.nextInt();
		
			if(x < y) {
				tempodejogo = y - x;
			}else {
				tempodejogo = 24 - x + y;
			}
		
			System.out.print("O Jogo Durou " + tempodejogo + " Horas.");
			sc.close();

	}

}
