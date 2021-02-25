package ProgramaSequencial;

import java.util.Scanner; 	// Biblioteca para utilizar Scanner

public class Atividade1 {
	public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)) {	// Scanner é o leitor para (ler)

			int anos, meses, dias, totaldias;

			System.out.println("Entre com anos:");	// Escrever na tela
			anos = ler.nextInt();					// Utiliza (ler) para atribuir na variavel (anos)

			System.out.println("Entre com meses:");
			meses = ler.nextInt();

			System.out.println("Entre com dias:");
			dias = ler.nextInt();
			
			totaldias = anos*365 + meses*30 + dias;	// Formula matemática

		System.out.printf("Você viveu: %d dia(s) de vida ",totaldias);

		}
	}
}
