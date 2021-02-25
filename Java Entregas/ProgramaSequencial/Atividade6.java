package ProgramaSequencial;

import java.util.Scanner;

public class Atividade6 {
	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)){

			double x1, x2, y1, y2, potencia, distancia; 

			
			System.out.println("Entre com o valor de X1: ");
			x1 = ler.nextInt();
			System.out.println("Entre com o valor de X2: ");
			x2 = ler.nextInt();
			System.out.println("Entre com o valor de Y1: ");
			y1 = ler.nextInt();
			System.out.println("Entre com o valor de Y2: ");
			y2 = ler.nextInt();
			
			potencia = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
			distancia = Math.sqrt(potencia);

			System.out.printf("A expressão foi de: %5.2f",distancia);
			
		}	
	}
}