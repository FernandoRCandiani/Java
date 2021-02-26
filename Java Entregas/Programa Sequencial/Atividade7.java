package ProgramaSequencial;

import java.util.Scanner;

public class Atividade7 {
	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)){
			
				float a, b, c, d, e, f, x, y;
				
				System.out.println("Valor de A: ");
				a = ler.nextFloat();
				System.out.println("Valor de B: ");
				b = ler.nextFloat();
				System.out.println("Valor de C: ");
				c = ler.nextFloat();
				System.out.println("Valor de D: ");
				d = ler.nextFloat();
				System.out.println("Valor de E: ");
				e = ler.nextFloat();
				System.out.println("Valor de F: ");
				f = ler.nextFloat();
				
				x=(((c*e)-(b*f)) / ((a*e)-(b*d)));
				y=(((a*f)-(c*d)) / ((a*e)-(b*d)));
				
				System.out.printf("O valor de X: %3.2f \nO valor de Y: %3.2f",x, y);
		}
	}
}
