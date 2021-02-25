package ProgramaSequencial;

import java.util.Scanner;	// Biblioteca para utilizar Scanner

public class Atividade2 {
	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)){		// Scanner é o leitor para (ler)
			
			int anos, meses, dias, idadedias;
			
			System.out.println("Digite sua idade em dias: ");	// Escrever na tela
			idadedias = ler.nextInt();							// Utiliza (ler) para atribuir na variavel (idadedias)
			
			anos = idadedias / 365;				// Formula matemática
			meses = (idadedias%365)/30;
			dias = (idadedias%365)%30;
			
			System.out.printf("Você viveu: %d anos %d meses %d dia(s) de vida ...", anos, meses, dias);
		
		}
	}
}
