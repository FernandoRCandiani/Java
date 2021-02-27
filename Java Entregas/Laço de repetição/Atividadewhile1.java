package ExerciciosRepeticao;

import java.util.Scanner;

public class Atividadewhile1 {
	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)) {	
			int idade,cont=0,cont1=0;
			
			System.out.println("Sua idade? ");
			idade = ler.nextInt();
			
			while(idade!=-99) {
				if(idade<=21) {
					
					cont++;
					System.out.printf("\nSua idade é: %d\n",idade);
				
					System.out.println("\nSua idade? ");
					idade = ler.nextInt();

				}
				else if(idade>=50) {
					
					cont1++;
					System.out.printf("\nSua idade é: %d\n",idade);
					
					System.out.println("\nSua idade? ");
					idade = ler.nextInt();

				}
				else {
					System.out.printf("\nSua idade é: %d\n",idade);
					
					System.out.println("\nSua idade? ");
					idade = ler.nextInt();

				}
					
			}
			System.out.printf("\nPessoas com menos de 21 anos: %d \nPessoas com mais de 50 anos: %d",cont,cont1);
		
		}
	}
}