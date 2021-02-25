package ProgramaSequencial;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)){
			
			int horas, minutos, segundos, totalsegundos;
			
			System.out.println("Digite a duração do evento em segundos: ");
			totalsegundos = ler.nextInt();
			
			horas = totalsegundos / 3600;
			minutos = (totalsegundos %3600) / 60;
			segundos = (totalsegundos %3600) %60;
			
			System.out.printf("A duração do evento em horas é: %d h %d min %d s",horas, minutos, segundos);
		}
	}
}
