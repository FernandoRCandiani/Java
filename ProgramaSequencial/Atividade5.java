package ProgramaSequencial;

import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		try(Scanner ler = new Scanner(System.in)){
			
			int peso1 = 2, peso2 = 3, peso3 = 5;	// int = inteiro
			float nota1, nota2, nota3, media; 		// float = real (flutuente)
			
			System.out.println("Valor da Primeira nota: ");
			nota1 = ler.nextFloat();
			System.out.println("valor da Segunda nota:");
			nota2 = ler.nextFloat();
			System.out.println("Valor da Terceira nota:");	
			nota3 = ler.nextFloat();
			
			media = (((peso1*nota1)+(peso2*nota2)+(peso3*nota3)) / (peso1+peso2+peso3));
			
			System.out.printf("A media do aluno e: %2.2f ",media); // %f = float
			
		}
	}
}
