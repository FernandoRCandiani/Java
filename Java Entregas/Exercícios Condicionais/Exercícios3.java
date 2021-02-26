package ProgramaSequencial;

import java.util.Scanner;

public class Exercícios3 {
	public static void main(String[] args) {
		try (Scanner ler = new Scanner (System.in)) {
		
			int idade;
			
			System.out.println("Digite o Sua idade: ");
			idade = ler.nextInt();

			
			if(idade>=10 && idade<=14){
				System.out.printf("Voce se enconta na area infantil: %d",idade);
			}
			else if (idade>=15 && idade<=17){
					System.out.printf("Voce se enconta na area juvenil: %d",idade);
				}
			else if (idade>=18){
					System.out.printf("Voce se enconta na area adulto: %d",idade);
				}
			else{
					System.out.printf("\nIdade invalida:");
			}
		}
	}
}
