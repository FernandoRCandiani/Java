package ProgramaSequencial;

import java.util.Scanner;

public class Exercícios4 {
	public static void main(String[] args) {
		try(Scanner ler =new Scanner(System.in)){
		
			int numero;
			double resutado;
		
			System.out.println("Digite um Valor:");
			numero = ler.nextInt();
			
			if(numero%2 == 0){
			resutado = (int) Math.sqrt(numero);
			}
			else{
				resutado = (int) Math.pow(numero,2);
			}
			System.out.println("O resutado: "+resutado);
		}
	}
}
