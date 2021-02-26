package ProgramaSequencial;

import java.util.Scanner;

public class Exercícios1 {
	public static void main(String[] args) {
		try (Scanner ler = new Scanner (System.in)) {
			int num1, num2, num3;
			
			System.out.println("Digite o Primeiro valor: ");
			num1 = ler.nextInt();
			System.out.println("Digite o Segundo valor: ");
			num2 = ler.nextInt();
			System.out.println("Digite o Terceiro valor: ");
			num3 = ler.nextInt();
			
			if(num1 > num2 && num1 > num3){
				System.out.printf("\nO maior numero é: %d",num1);
			}
			else if (num2 > num1 && num2 > num3){
				System.out.printf("\nO maior numero é: %d",num2);
			}
			else{
				System.out.printf("\nO maior numero é: %d",num3);
			}
		}
	}
}
