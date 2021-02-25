package ProgramaSequencial;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)){

			double a, b, c, d, divisao; 

			
			System.out.println("Entre com o valor de A: ");
			a = ler.nextInt();
			System.out.println("Entre com o valor de B: ");
			b = ler.nextInt();
			System.out.println("Entre com o valor de C: ");
			c = ler.nextInt();
			
			d = Math.pow((a+b),2) + Math.pow((b+c),2);
			divisao = d/2;
			
			System.out.printf("A expressão foi de: %5.2f",divisao);
			
		}	
	}
}