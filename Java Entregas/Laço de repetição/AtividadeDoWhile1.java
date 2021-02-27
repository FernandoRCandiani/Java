package ExerciciosRepeticao;

import java.util.Scanner;

public class AtividadeDoWhile1 {
	public static void main(String[] args) {
		try(Scanner ler = new Scanner(System.in)) {
			
			int num, soma=0;

			do {
				System.out.println("Adiciona um valor: ");
				num = ler.nextInt();
				
				if(num>0) {
				
				soma = soma + num;	
				}
			}
			while(num!=0); 
			System.out.printf("\nA soma dos numeros: %d ",soma);	
		}
	}	
}
