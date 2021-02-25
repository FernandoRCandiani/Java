package ProgramaSequencial;

import java.util.Scanner;

public class Atividade8 {
	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)){
			
			double distribuidor = 0.28, imposto = 0.45,fabrica, carro;
			
			System.out.println("O custo da fabrica: ");
			carro = ler.nextFloat();
			
			fabrica = (carro + ((carro*distribuidor)+(carro*imposto)));
			
			System.out.printf("O custo de consumidor: %10.2f ",fabrica);
			
		}
	}
}
