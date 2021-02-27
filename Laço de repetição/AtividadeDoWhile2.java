package ExerciciosRepeticao;

import java.util.Scanner;

public class AtividadeDoWhile2 {
	public static void main(String[] args) {
		try(Scanner ler = new Scanner(System.in)) {

			int x, cont=0,soma=0;
			float media;
			
			do {
				System.out.println("Digite um valor:");
				x = ler.nextInt();
				
				if(x!=0){
					if(x%3==0) {

						soma = soma + x;
						cont++;
					}
				}
			}
			while(x!=0);
			media=soma/cont;
			System.out.printf("\nA media: %5.2f",media);
		}
	}
}
